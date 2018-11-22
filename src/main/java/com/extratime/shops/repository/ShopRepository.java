package com.extratime.shops.repository;

import com.extratime.shops.entity.Shop;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface ShopRepository extends CrudRepository<Shop, Long> {

    List<Shop> findBycontent(String content);
}