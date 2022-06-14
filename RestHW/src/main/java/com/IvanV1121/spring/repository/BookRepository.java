package com.IvanV1121.spring.repository;

import com.IvanV1121.spring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "select distinct book_title, book_price from book", nativeQuery = true)
    List<Object[]> findTitleAndPrices();

    @Query(value = "select book_title, book_price from book where (book_title like %substring%) " +
                   "or (book_price >= minPrice) order by book_title asc, book_price desc", nativeQuery = true)
    List<Object[]> findSubstringOrMinPrice(String substring, int minPrice);

    @Query(value = "select book_title, book_storage, book_quantity, book_price from book b join purchase p on " +
                   "(b.book_id = p.purchase_book and b.book_quantity >= minQuantity) join shop s on (s.shop_id = p.purchase_shop " +
                   "and s.shop_location = b.book_storage) order by book_price asc", nativeQuery = true)
    List<Object[]> findPurchasedInfo(int minQuantity);
}