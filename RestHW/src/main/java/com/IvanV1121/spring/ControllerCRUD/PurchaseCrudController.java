package com.IvanV1121.spring.ControllerCRUD;

import com.IvanV1121.spring.service.NotFoundExceptionService;
import com.IvanV1121.spring.model.Purchase;
import com.IvanV1121.spring.service.PurchaseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/purchasesCrud")
@Tag(name = "Purchase CRUD Controller")
public class PurchaseCrudController {

    @Autowired
    private PurchaseService service;

    @DeleteMapping("{id}")
    @Operation(summary = "Delete by id")
    public Map<String, Boolean> deletePurchase(@PathVariable Integer id) throws NotFoundExceptionService {
        service.delete(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", true);
        return response;
    }

    @PatchMapping("{id}")
    @Operation(summary = "Update by id")
    public Purchase updatePurchase(@PathVariable Integer id, @RequestBody Purchase newPurchase) throws NotFoundExceptionService {
        return service.updateById(id, newPurchase);
    }

    @PostMapping
    @Operation(summary = "Add new")
    public Purchase addPurchase(@RequestBody Purchase newPurchase) throws NotFoundExceptionService {
        return service.add(newPurchase);
    }

    @GetMapping
    @Operation(summary = "Get all")
    public List<Purchase> getAllPurchases() {
        return service.getAll();
    }

    @GetMapping("{id}")
    @Operation(summary = "Get by id")
    public ResponseEntity<Purchase> getPurchase(@PathVariable(value = "id") Integer id) throws NotFoundExceptionService {
        return ResponseEntity.ok().body(service.getById(id));
    }

    @PutMapping("{id}")
    @Operation(summary = "Rewrite by id")
    public Purchase replacePurchase(@PathVariable(value = "id") Integer id, @RequestBody Purchase newPurchase) throws NotFoundExceptionService {
        return service.rewriteById(id, newPurchase);
    }
}