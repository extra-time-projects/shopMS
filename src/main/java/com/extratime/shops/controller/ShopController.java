package com.extratime.shops.controller;

import com.extratime.shops.entity.Shop;
import com.extratime.shops.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ShopController {

    @Autowired
    private ShopRepository repository;

    @GetMapping("/shops/{id}")
    public Optional<Shop> shop(@PathVariable long id) {
        return repository.findById(id);
    }

    @GetMapping("/shops")
    public Iterable<Shop> shops(){
        return repository.findAll();
    }

    @PostMapping("/shops")
    public @ResponseBody ResponseEntity<String> post(@RequestBody Shop shop) {
        repository.save(shop);
        return new ResponseEntity<String>("Shop: id " + shop.getId()
                + " content: "+ shop.getContent() + " --> saved " , HttpStatus.OK);
    }

}
