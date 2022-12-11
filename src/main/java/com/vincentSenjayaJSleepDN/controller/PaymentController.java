package com.vincentSenjayaJSleepDN.controller;
import com.vincentSenjayaJSleepDN.*;
import com.vincentSenjayaJSleepDN.dbjson.JsonTable;
import com.vincentSenjayaJSleepDN.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


@RestController
@RequestMapping("/payment")
public class PaymentController implements BasicGetController<Payment> {

    @JsonAutowired(value = Payment.class, filepath = "C:\\Users\\vince\\Prak OOP\\ProyekOOP\\JSleep\\src\\main\\java\\com\\json\\payment.json")
    public static JsonTable<Payment> paymentTable;
    @Override
    @GetMapping("/getPaymentTable")
    public JsonTable<Payment> getJsonTable() {
        return paymentTable;
    }

    @Override
    public Payment getById(int id) {
        return BasicGetController.super.getById(id);
    }

    @Override
    public List<Payment> getPage(int page, int pageSize) {
        return BasicGetController.super.getPage(page, pageSize);
    }


    @PostMapping("/{id}/cancel")
    public boolean cancel(@PathVariable int id) {
        for (Payment iterate : paymentTable) {
            if (iterate.buyerId == id && iterate.getRoomId() == id) {
                if (iterate.status == Invoice.PaymentStatus.WAITING) {
                    iterate.status = Invoice.PaymentStatus.FAILED;
                    Account account1 = Algorithm.<Account>find(AccountController.accountTable, e -> e.id == id);
                    Room room1 = Algorithm.<Room>find(RoomController.roomTable, e -> e.id == id);
                    account1.balance += room1.price.price;
                    return true;
                }
            }
        }
        return false;
    }

    @PostMapping("/create")
    @ResponseBody
    Payment create(@RequestParam int buyerId, @RequestParam int renterId, @RequestParam int roomId,
                          @RequestParam String from, @RequestParam String to) throws ParseException {
        Room room1 = Algorithm.<Room>find(RoomController.roomTable, e -> e.id == roomId);
        Account account1 = Algorithm.<Account>find(AccountController.accountTable, e -> e.id == buyerId);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date toDate = sdf.parse(to);
        Date fromDate = sdf.parse(from);

        if (room1 != null && account1 != null && Payment.availability(fromDate, toDate, room1)) {
            if (room1.price.price > account1.balance ) {
                return null;
            } else {
                Payment payment = new Payment(buyerId, renterId, roomId);
                account1.balance -= room1.price.price;
                Invoice invoice = new Invoice(account1,account1.renter);
                invoice.status = Invoice.PaymentStatus.WAITING;
                paymentTable.add(payment);
                return payment;
//                if (Payment.makeBooking(fromDate, toDate, room1)){
//                    return payment;
//                }
            }
        }
        return null;
    }
    @PostMapping("/{id}/accept")
    public boolean accept(@PathVariable int id) {
        for (Payment iterate : paymentTable) {
            if (iterate.id == id) {
                if (iterate.status == Invoice.PaymentStatus.WAITING) {
                    iterate.status = Invoice.PaymentStatus.SUCCESS;
                    return true;
                }
            }
        }
        return false;
    }

    @GetMapping("/byAccount")
    public List<Payment> getPaymentByUser(@RequestParam int buyerId) {

        return Algorithm.<Payment>collect(PaymentController.paymentTable, e -> e.buyerId == buyerId);

    }

    @PostMapping("/{id}/submit")
    public boolean submit(@PathVariable int id, @RequestParam String receipt) {

        return false;
    }

}