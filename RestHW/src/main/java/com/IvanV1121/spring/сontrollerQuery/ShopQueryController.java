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
    public List<String> getSovetskyShops(@RequestParam String district) {
        return service.getByLocation(district);
    }

    @GetMapping("sormovsky")
    public List<String> getSormovskyShops(@RequestParam String district) {
        return service.getByLocation(district);
    }

    @GetMapping("discount-10-15-percent")
    public List<String> getShopsWithDiscount(@RequestParam String district, @RequestParam Integer lower, @RequestParam Integer upper) {
        return service.getWithDiscountBetween10And15(district, lower, upper);
    }
}