package com.ua.cabare;

import javax.persistence.*;
import java.util.Collection;
import java.sql.SQLException;


@Entity
@Table(name = "menu")
public class Dish extends Object{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}


