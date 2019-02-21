package com.extratime.shops.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop {

    @Id
    private long id;
    private String content;

    public Shop(){
    }


    public Shop(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
