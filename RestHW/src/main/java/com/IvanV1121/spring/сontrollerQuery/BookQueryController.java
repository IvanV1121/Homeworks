package com.IvanV1121.spring.сontrollerQuery;

import com.IvanV1121.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booksQuery")
public class BookQueryController {

    @Autowired
    private BookService service;

    @GetMapping("different-titles-different-prices")
    public List<Object[]> getBooksTitlesAndPrices() {
        return service.getTitlesAndPrices();
    }

    @GetMapping("word-substring-or-price-more-than-given")
    public List<Object[]> getSubstringOrMinPrice(@RequestParam String substring, @RequestParam Integer minSum) {
        return service.getSubstringOrMinPrice(substring, minSum);
    }

    @GetMapping("purchased-information")
    public List<Object[]> getBooksPurchasedInfo(@RequestParam Integer minQuantity) {
        return service.getPurchasedInfo(minQuantity);
    }
}