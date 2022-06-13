package com.IvanV1121.spring.ControllerQuery;

import com.IvanV1121.spring.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booksQuery")
@Tag(name = "Book Query Controller")
public class BookQueryController {

    @Autowired
    private BookService service;

    @GetMapping("different-titles-different-prices")
    @Operation(summary = "All different titles and prices of books")
    public List<Object[]> getBooksTitlesAndPrices() {
        return service.getTitlesAndPrices();
    }

    @GetMapping("word-windows-or-price-more-20000")
    @Operation(summary = "Titles and prices of books with word 'Windows' or with price more than 20000")
    public List<Object[]> getBooksWindowsOr20000() {
        return service.getWindowsOr20000();
    }

    @GetMapping("purchased-information")
    @Operation(summary = "Titles, storages, quantity of books purchased in the shop area and contained in stock more than 10 pieces. " +
            "Include price and sort in ascending order")
    public List<Object[]> getBooksPurchasedInfo() {
        return service.getPurchasedInfo();
    }
}