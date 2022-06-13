package com.IvanV1121.spring.ControllerCRUD;

import com.IvanV1121.spring.service.NotFoundExceptionService;
import com.IvanV1121.spring.model.Book;
import com.IvanV1121.spring.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/booksCrud")
@Tag(name = "Book CRUD Controller")
public class BookCrudController {

    @Autowired
    private BookService service;

    @DeleteMapping("{id}")
    @Operation(summary = "Delete by id")
    public Map<String, Boolean> deleteBook(@PathVariable Integer id) throws NotFoundExceptionService {
        service.delete(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", true);
        return response;
    }

    @PatchMapping("{id}")
    @Operation(summary = "Update by id")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book newBook) throws NotFoundExceptionService {
        return service.updateById(id, newBook);
    }

    @PostMapping
    @Operation(summary = "Add new")
    public Book addBook(@RequestBody Book newBook) {
        return service.add(newBook);
    }

    @GetMapping
    @Operation(summary = "Get all")
    public List<Book> getAllBooks() {
        return service.getAll();
    }

    @GetMapping("{id}")
    @Operation(summary = "Get by id")
    public ResponseEntity<Book> getBook(@PathVariable(value = "id") Integer id) throws NotFoundExceptionService {
        return ResponseEntity.ok().body(service.getById(id));
    }

    @PutMapping("{id}")
    @Operation(summary = "Rewrite by id")
    public Book replaceBook(@PathVariable(value = "id") Integer id, @RequestBody Book newBook) throws NotFoundExceptionService {
        return service.rewriteById(id, newBook);
    }
}