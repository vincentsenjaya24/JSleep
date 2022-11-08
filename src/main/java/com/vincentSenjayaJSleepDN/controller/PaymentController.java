package com.vincentSenjayaJSleepDN.controller;
import com.vincentSenjayaJSleepDN.*;
import com.vincentSenjayaJSleepDN.dbjson.JsonTable;
import com.vincentSenjayaJSleepDN.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController implements BasicGetController<Payment> {
    @JsonAutowired(value = Payment.class, filepath = "payment.json")
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


    @PostMapping("/{id}/accept")
    public boolean accept(@PathVariable int id) {
        return false;
    }

    @PostMapping("/{id}/cancel")
    public boolean cancel(@PathVariable int id) {
        return false;
    }


    @PostMapping("/create")
    public Payment create(@RequestParam int buyerId, @RequestParam int renterId, @RequestParam int roomId,
                          @RequestParam String from, @RequestParam String to) {
        return null;
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