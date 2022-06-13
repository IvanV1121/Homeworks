package com.IvanV1121.spring.сontrollerCRUD;

import com.IvanV1121.spring.service.NotFoundExceptionService;
import com.IvanV1121.spring.model.Purchase;
import com.IvanV1121.spring.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/purchasesCrud")
public class PurchaseCrudController {

    @Autowired
    private PurchaseService service;

    @DeleteMapping("{id}")
    public Map<String, Boolean> deletePurchase(@PathVariable Integer id) throws NotFoundExceptionService {
        service.delete(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", true);
        return response;
    }

    @PatchMapping("{id}")
    public Purchase updatePurchase(@PathVariable Integer id, @RequestBody Purchase newPurchase) throws NotFoundExceptionService {
        return service.updateById(id, newPurchase);
    }

    @PostMapping
    public Purchase addPurchase(@RequestBody Purchase newPurchase) throws NotFoundExceptionService {
        return service.add(newPurchase);
    }

    @GetMapping
    public List<Purchase> getAllPurchases() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Purchase> getPurchase(@PathVariable(value = "id") Integer id) throws NotFoundExceptionService {
        return ResponseEntity.ok().body(service.getById(id));
    }

    @PutMapping("{id}")
    public Purchase replacePurchase(@PathVariable(value = "id") Integer id, @RequestBody Purchase newPurchase) throws NotFoundExceptionService {
        return service.rewriteById(id, newPurchase);
    }
}