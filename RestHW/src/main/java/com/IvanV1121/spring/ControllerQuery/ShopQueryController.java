package com.IvanV1121.spring.ControllerQuery;

import com.IvanV1121.spring.service.ShopService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopQuery")
@Tag(name = "Shop Query Controller")
public class ShopQueryController {

    @Autowired
    private ShopService service;

    @GetMapping("sovetsky")
    @Operation(summary = "Names of shops from Sovetsky District")
    public List<String> getSovetskyShops() {
        return service.getByLocation("Sovetsky");
    }

    @GetMapping("sormovsky")
    @Operation(summary = "Names of shops from Sormovsky District")
    public List<String> getSormovskyShops() {
        return service.getByLocation("Sormovsky");
    }

    @GetMapping("discount-10-15-percent")
    @Operation(summary = "Get names of shops located in any area, except for Avtozavodsky District, where books were " +
            "bought by customers with discount between 10% and 15%")
    public List<String> getShopsWithDiscount() {
        return service.getWithDiscountBetween10And15();
    }
}