package com.IvanV1121.spring.сontrollerCRUD;

import com.IvanV1121.spring.service.NotFoundExceptionService;
import com.IvanV1121.spring.model.Shop;
import com.IvanV1121.spring.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/shopCrud")
public class ShopCrudController {

    @Autowired
    private ShopService service;

    @DeleteMapping("{id}")
    public Map<String, Boolean> deleteShop(@PathVariable Integer id) throws NotFoundExceptionService {
        service.delete(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", true);
        return response;
    }

    @PatchMapping("{id}")
    public Shop updateShop(@PathVariable Integer id, @RequestBody Shop newShop) throws NotFoundExceptionService {
        return service.updateById(id, newShop);
    }

    @PostMapping
    public Shop addShop(@RequestBody Shop newShop) {
        return service.add(newShop);
    }

    @GetMapping
    public List<Shop> getAllShops() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Shop> getShop(@PathVariable(value = "id") Integer id) throws NotFoundExceptionService {
        return ResponseEntity.ok().body(service.getById(id));
    }

    @PutMapping("{id}")
    public Shop replaceShop(@PathVariable(value = "id") Integer id, @RequestBody Shop newShop) throws NotFoundExceptionService {
        return service.rewriteById(id, newShop);
    }
}