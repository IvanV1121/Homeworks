package com.IvanV1121.spring.service;

import com.IvanV1121.spring.model.Shop;
import com.IvanV1121.spring.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepository repository;

    ///////////////////////////////////////////////////// CRUD  ////////////////////////////////////////////////////////

    public void delete(Integer id) throws NotFoundExceptionService {
        Shop shop = repository.findById(id).orElseThrow(() -> new NotFoundExceptionService());
        repository.delete(shop);
    }

    public Shop updateById(Integer id, Shop newShop) throws NotFoundExceptionService {
        Shop shop = repository.findById(id).orElseThrow(() -> new NotFoundExceptionService());

        if (newShop.getName() != null) {
            shop.setName(newShop.getName());
        }
        if (newShop.getLocation() != null) {
            shop.setLocation(newShop.getLocation());
        }
        if (newShop.getCommission() != 0) {
            shop.setCommission(newShop.getCommission());
        }

        return repository.save(shop);
    }

    public Shop add(Shop newShop) {
        return repository.save(newShop);
    }

    public List<Shop> getAll() {
        return repository.findAll();
    }

    public Shop getById(Integer id) throws NotFoundExceptionService {
        return repository.findById(id).orElseThrow(() -> new NotFoundExceptionService());
    }

    public Shop rewriteById(Integer id, Shop newShop) throws NotFoundExceptionService {
        Shop shop = repository.findById(id).orElseThrow(() -> new NotFoundExceptionService());
        shop.setName(newShop.getName());
        shop.setLocation(newShop.getLocation());
        shop.setCommission(newShop.getCommission());
        return repository.save(shop);
    }

    ///////////////////////////////////////////////////// Query  ///////////////////////////////////////////////////////

    public List<String> getByLocation(String district) {
        return repository.findByLocation(district);
    }

    public List<String> getWithDiscountBetween10And15(String district, int lower, int upper) {
        return repository.findCustomersWithSaleBetween10And15(district, lower, upper);
    }

}