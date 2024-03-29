package com.IvanV1121.spring.repository;

import com.IvanV1121.spring.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

    @Query(value = "select shop_name from shop where shop_location = :district", nativeQuery = true)
    List<String> findByLocation(String district);

    @Query(value = "select distinct s.shop_name from shop s join purchase p on " +
            "(s.shop_id = p.purchase_shop and s.shop_location <> :district) join customer c on " +
            "(c.customer_id = p.purchase_customer and c.customer_sale between :lower and :upper)", nativeQuery = true)
    List<String> findCustomersWithSaleBetween10And15(String district, int lower, int upper);

}