package com.IvanV1121.spring.ControllerCRUD;

import com.IvanV1121.spring.service.NotFoundExceptionService;
import com.IvanV1121.spring.model.Shop;
import com.IvanV1121.spring.service.ShopService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/shopCrud")
@Tag(name = "Shop CRUD Controller")
public class ShopCrudController {

    @Autowired
    private ShopService service;

    @DeleteMapping("{id}")
    @Operation(summary = "Delete by id")
    public Map<String, Boolean> deleteShop(@PathVariable Integer id) throws NotFoundExceptionService {
        service.delete(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", true);
        return response;
    }

    @PatchMapping("{id}")
    @Operation(summary = "Update by id")
    public Shop updateShop(@PathVariable Integer id, @RequestBody Shop newShop) throws NotFoundExceptionService {
        return service.updateById(id, newShop);
    }

    @PostMapping
    @Operation(summary = "Add new")
    public Shop addShop(@RequestBody Shop newShop) {
        return service.add(newShop);
    }

    @GetMapping
    @Operation(summary = "Get all")
    public List<Shop> getAllShops() {
        return service.getAll();
    }

    @GetMapping("{id}")
    @Operation(summary = "Get by id")
    public ResponseEntity<Shop> getShop(@PathVariable(value = "id") Integer id) throws NotFoundExceptionService {
        return ResponseEntity.ok().body(service.getById(id));
    }

    @PutMapping("{id}")
    @Operation(summary = "Rewrite by id")
    public Shop replaceShop(@PathVariable(value = "id") Integer id, @RequestBody Shop newShop) throws NotFoundExceptionService {
        return service.rewriteById(id, newShop);
    }
}