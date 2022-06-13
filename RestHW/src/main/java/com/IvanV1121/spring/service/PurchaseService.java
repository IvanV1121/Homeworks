package com.IvanV1121.spring.service;

import com.IvanV1121.spring.model.Book;
import com.IvanV1121.spring.model.Customer;
import com.IvanV1121.spring.model.Purchase;
import com.IvanV1121.spring.model.Shop;
import com.IvanV1121.spring.repository.BookRepository;
import com.IvanV1121.spring.repository.CustomerRepository;
import com.IvanV1121.spring.repository.PurchaseRepository;
import com.IvanV1121.spring.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository repository;
    @Autowired
    private ShopRepository shopRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private BookRepository bookRepository;

    ///////////////////////////////////////////////////// CRUD  ////////////////////////////////////////////////////////
    public void delete(Integer id) throws NotFoundExceptionService {
        Purchase purchase = repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());
        Book book = bookRepository.findById(purchase.getBook()).
                orElseThrow(() -> new NotFoundExceptionService());
        book.setQuantity(book.getQuantity() + purchase.getQuantity());
        repository.delete(purchase);
    }

    public Purchase updateById(Integer id, Purchase newPurchase) throws NotFoundExceptionService {
        Purchase purchase = repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());

        if (newPurchase.getDate() == null){
            newPurchase.setDate(purchase.getDate());
        }
        if (newPurchase.getShop() == 0){
            newPurchase.setShop(purchase.getShop());
        }
        if (newPurchase.getCustomer() == 0){
            newPurchase.setCustomer(purchase.getCustomer());
        }
        if (newPurchase.getBook() == 0){
            newPurchase.setBook(purchase.getBook());
        }
        if (newPurchase.getQuantity() == 0) {
            newPurchase.setQuantity(purchase.getQuantity());
        }
        return updateHelper(newPurchase, purchase);
    }

    public Purchase add(Purchase newPurchase) throws NotFoundExceptionService {
        Book newBook = bookRepository.findById(newPurchase.getBook()).orElseThrow(()
                -> new NotFoundExceptionService());
        newBook.setQuantity(newBook.getQuantity() - newPurchase.getQuantity());
        newPurchase.setSum(calculateSum(newBook, newPurchase));
        return repository.save(newPurchase);
    }

    public List<Purchase> getAll() {
        return repository.findAll();
    }

    public Purchase getById(Integer id) throws NotFoundExceptionService {
        return repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());
    }

    public Purchase rewriteById(Integer id, Purchase newPurchase) throws NotFoundExceptionService {
        Purchase purchase = repository.findById(id).orElseThrow(()
                -> new NotFoundExceptionService());
        return updateHelper(newPurchase, purchase);
    }

    ///////////////////////////////////////////////////// Query  ///////////////////////////////////////////////////////

    public List<String> getMonths() {
        return repository.findMonths();
    }

    public List<Object[]> getCustomersAndShops() {
        return repository.findCustomersAndShops();
    }

    public List<Object[]> getCustomersAndBooks() {
        return repository.findCustomersAndBooks();
    }

    public List<Object[]> getSumMoreThan60000() {
        return repository.findSumMoreThan60000();
    }

    public List<Object[]> getInTheSameDistrict() {
        return repository.findInTheSameDistrict();
    }

    /////////////////////////////////////////////////////// Aux ////////////////////////////////////////////////////////

    private int calculateSum(Book newBook, Purchase newPurchase) throws NotFoundExceptionService {
        Shop shop = shopRepository.findById(newPurchase.getShop()).orElseThrow(()
                -> new NotFoundExceptionService());
        Customer customer = customerRepository.findById(newPurchase.getCustomer()).orElseThrow(()
                -> new NotFoundExceptionService());
        return ((int) (newPurchase.getQuantity() * (1 + shop.getCommission()
                / (double)100) * (1 - customer.getSale()
                / (double)100) * newBook.getPrice()));
    }

    private Purchase updateHelper(Purchase newPurchase, Purchase purchase) throws NotFoundExceptionService {
        Book book = bookRepository.findById(purchase.getBook()).orElseThrow(()
                        -> new NotFoundExceptionService());
        Book newBook = book;
        if (purchase.getBook() != newPurchase.getBook()) {
            newBook = bookRepository.findById(newPurchase.getBook()).orElseThrow(()
                            -> new NotFoundExceptionService());
            book.setQuantity(book.getQuantity() + purchase.getQuantity());
            newBook.setQuantity(newBook.getQuantity() - newPurchase.getQuantity());
        } else {
            book.setQuantity(book.getQuantity() + (purchase.getQuantity() - newPurchase.getQuantity()));
        }

        purchase.setDate(newPurchase.getDate());
        purchase.setShop(newPurchase.getShop());
        purchase.setCustomer(newPurchase.getCustomer());
        purchase.setBook(newPurchase.getBook());
        purchase.setQuantity(newPurchase.getQuantity());
        purchase.setSum(calculateSum(newBook, newPurchase));

        return repository.save(purchase);
    }
}