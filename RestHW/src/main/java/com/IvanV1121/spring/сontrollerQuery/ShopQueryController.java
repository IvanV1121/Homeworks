package com.IvanV1121.spring.сontrollerQuery;

import com.IvanV1121.spring.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopQuery")
public class ShopQueryController {

    @Autowired
    private ShopService service;

    @GetMapping("sovetsky")
    public List<String> getSovetskyShops() {
        return service.getByLocation("Sovetsky");
    }

    @GetMapping("sormovsky")
    public List<String> getSormovskyShops() {
        return service.getByLocation("Sormovsky");
    }

    @GetMapping("discount-10-15-percent")
    public List<String> getShopsWithDiscount() {
        return service.getWithDiscountBetween10And15();
    }
}