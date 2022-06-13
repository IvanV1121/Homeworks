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

    @GetMapping("word-windows-or-price-more-20000")
    public List<Object[]> getBooksWindowsOr20000() {
        return service.getWindowsOr20000();
    }

    @GetMapping("purchased-information")
    public List<Object[]> getBooksPurchasedInfo() {
        return service.getPurchasedInfo();
    }
}