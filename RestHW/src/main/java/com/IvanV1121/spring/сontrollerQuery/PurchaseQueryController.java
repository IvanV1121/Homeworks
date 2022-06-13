package com.IvanV1121.spring.сontrollerQuery;

import com.IvanV1121.spring.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchasesQuery")
public class PurchaseQueryController {

    @Autowired
    private PurchaseService service;

    @GetMapping("months-purchase")
    public List<String> getPurchasesMonths() {
        return service.getMonths();
    }

    @GetMapping("customers-and-shops")
    public List<Object[]> getPurchasesCustomersAndShops() {
        return service.getCustomersAndShops();
    }

    @GetMapping("customers-and-books")
    public List<Object[]> getPurchasesCustomersAndBooks() {
        return service.getCustomersAndBooks();
    }

    @GetMapping("order-60000")
    public List<Object[]> getPurchases60000() {
        return service.getSumMoreThan60000();
    }

    @GetMapping("in-the-same-district")
    public List<Object[]> getPurchasesInTheSameDistrict() {
        return service.getInTheSameDistrict();
    }
}