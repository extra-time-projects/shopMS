package com.extratime.shops.controller;

import com.extratime.shops.entity.Shop;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ShopController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/shop")
    public Shop shop(@RequestParam(value="name", defaultValue="CaoEGato") String name) {
        return new Shop(counter.incrementAndGet(), name);
    }
}
