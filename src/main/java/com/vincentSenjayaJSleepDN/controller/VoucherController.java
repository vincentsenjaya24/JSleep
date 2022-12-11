package com.vincentSenjayaJSleepDN.controller;

import com.vincentSenjayaJSleepDN.Algorithm;
import com.vincentSenjayaJSleepDN.Price;
import com.vincentSenjayaJSleepDN.Room;
import com.vincentSenjayaJSleepDN.Voucher;
import com.vincentSenjayaJSleepDN.dbjson.JsonAutowired;
import com.vincentSenjayaJSleepDN.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voucher")
public class VoucherController implements BasicGetController<Voucher> {
    @JsonAutowired(filepath = "C:\\Users\\vince\\Prak OOP\\ProyekOOP\\JSleep\\src\\main\\java\\com\\json\\voucher.json", value = Voucher.class)
    public static JsonTable<Voucher> voucherTable;
    @Override
    public JsonTable<Voucher> getJsonTable() {
        return voucherTable;
    }
    @GetMapping("/{id}/isUsed")
    @ResponseBody
    boolean isUsed(@PathVariable int id){
        for (Voucher data : voucherTable) {
            if (data.id == id) {
                return data.isUsed();
            }
        }
        return false;
    }

    @GetMapping("/{id}/canApply")
    @ResponseBody
    boolean canApply(@RequestParam int id, @RequestParam double price) {
        for (Voucher data : voucherTable) {
            if (data.id == id) {
                return data.canApply(new Price(price));
            }
        }
        return false;
    }

    @GetMapping("/getAvailable")
    @ResponseBody
    List<Voucher> getAvailable(@RequestParam int page, @RequestParam int pageSize) {
        return Algorithm.paginate(voucherTable, page, pageSize, pred-> !pred.isUsed());
    }
    @Override
    public Voucher getById(int id) {
        return BasicGetController.super.getById(id);
    }

    @Override
    public List<Voucher> getPage(int page, int pageSize) {
        return BasicGetController.super.getPage(page, pageSize);
    }
}
