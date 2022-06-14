package com.IvanV1121.spring.service;

import com.IvanV1121.spring.model.Book;
import com.IvanV1121.spring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    ///////////////////////////////////////////////////// CRUD  ////////////////////////////////////////////////////////

    public void delete(Integer id) throws NotFoundExceptionService {
        Book book = repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());
        repository.delete(book);
    }

    public Book updateById(Integer id, Book newBook) throws NotFoundExceptionService {
        Book book = repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());

        if (newBook.getTitle() != null) {
            book.setTitle(newBook.getTitle());
        }
        if (newBook.getPrice() != 0) {
            book.setPrice(newBook.getPrice());
        }
        if (newBook.getStorage() != null) {
            book.setStorage(newBook.getStorage());
        }
        if (newBook.getQuantity() != 0) {
            book.setQuantity(newBook.getQuantity());
        }
        return repository.save(book);
    }

    public Book add(Book newBook) {
        return repository.save(newBook);
    }

    public List<Book> getAll() {
        return repository.findAll();
    }

    public Book getById(Integer id) throws NotFoundExceptionService {
        return repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());
    }

    public Book rewriteById(Integer id, Book newBook) throws NotFoundExceptionService {
        Book book = repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());
        book.setTitle(newBook.getTitle());
        book.setPrice(newBook.getPrice());
        book.setStorage(newBook.getStorage());
        book.setQuantity(newBook.getQuantity());
        return repository.save(book);
    }

    ///////////////////////////////////////////////////// Query  ///////////////////////////////////////////////////////
    public List<Object[]> getTitlesAndPrices() {
        return repository.findTitleAndPrices();
    }
    public List<Object[]> getSubstringOrMinPrice(String substring, int minSum) {
        return repository.findSubstringOrMinPrice(substring, minSum);
    }
    public List<Object[]> getPurchasedInfo(int minQuantity) {
        return repository.findPurchasedInfo(minQuantity);
    }
}
