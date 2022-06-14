package com.IvanV1121.spring.repository;

import com.IvanV1121.spring.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

    @Query(value = "select distinct to_char(purchase_date, 'Month') from purchase", nativeQuery = true)
    List<String> findMonths();

    @Query(value = "select p.purchase_id, c.customer_name, s.shop_name from purchase p join customer c " +
                   "on (c.customer_id = p.purchase_customer) join shop s on (s.shop_id = p.purchase_shop)", nativeQuery = true)
    List<Object[]> findCustomersAndShops();

    @Query(value = "select p.purchase_id, p.purchase_date, c.customer_name, c.customer_sale, b.book_title, p.purchase_quantity from purchase p " +
                   "join customer c on (c.customer_id = p.purchase_customer) join book b on (b.book_id = p.purchase_book)", nativeQuery = true)
    List<Object[]> findCustomersAndBooks();

    @Query(value = "select p.purchase_id, c.customer_name, p.purchase_date from purchase p join customer c on (c.customer_id = p.purchase_customer) " +
            "where p.p_sum >= :minSum", nativeQuery = true)
    List<Object[]> findSumMoreThanGiven(int minSum);

    @Query(value = "select p.purchase_id, c.customer_name, c.customer_district, p.purchase_date from purchase p join customer c " +
            "on (c.customer_id = p.purchase_customer) join shop s on (s.shop_id = p.purchase_shop and s.shop_location = c.customer_district) " +
            "where p.purchase_date >= cast(dateString as date) order by p.purchase_date", nativeQuery = true)
    List<Object[]> findInTheSameDistrict(String dateString);
}