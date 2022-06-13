package com.IvanV1121.spring.ControllerQuery;

import com.IvanV1121.spring.service.PurchaseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchasesQuery")
@Tag(name = "Purchase Query Controller")
public class PurchaseQueryController {

    @Autowired
    private PurchaseService service;

    @GetMapping("months-purchase")
    @Operation(summary = "All the different months when purchases were made")
    public List<String> getPurchasesMonths() {
        return service.getMonths();
    }

    @GetMapping("customers-and-shops")
    @Operation(summary = "Surname of customers and names of shops where purchases were made")
    public List<Object[]> getPurchasesCustomersAndShops() {
        return service.getCustomersAndShops();
    }

    @GetMapping("customers-and-books")
    @Operation(summary = "Date, surname and discount of customers, names and quantities of purchased books")
    public List<Object[]> getPurchasesCustomersAndBooks() {
        return service.getCustomersAndBooks();
    }

    @GetMapping("order-60000")
    @Operation(summary = "Order IDs, surnames of customers and dates of purchases were sold for an amount not less than 60000")
    public List<Object[]> getPurchases60000() {
        return service.getSumMoreThan60000();
    }

    @GetMapping("in-the-same-district")
    @Operation(summary = "Get order IDs, last names and residences of customers and dates of purchases made by " +
            "customers in their residences no earlier than March")
    public List<Object[]> getPurchasesInTheSameDistrict() {
        return service.getInTheSameDistrict();
    }
}