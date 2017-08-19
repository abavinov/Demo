package com.ua.cabare;

import java.util.Iterator;
import java.util.List;

import org.hibernate.jpa.event.spi.jpa.Listener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.sql.SQLException;
import java.util.ListIterator;

import com.ua.cabare.Dish;
import com.ua.cabare.UserRepository;

import javax.lang.model.element.Name;
import javax.persistence.Column;
import javax.persistence.NamedAttributeNode;

@Service
@Controller
@RequestMapping(path="/main")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewDish(@RequestParam String name
            , @RequestParam Double price) {

        Dish d = new Dish();
        d.setName(name);
        d.setPrice(price);
        userRepository.save(d);
        return "Complete";
    }
    //@GetMapping(path = "/menu")
    //public Collection getAllBusses() throws SQLException;

    @GetMapping(path = "/all" )
    public @ResponseBody
    Iterable<Dish> getAllDishes() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/get")
    public @ResponseBody
    Dish getOneDish(String id) {
        return userRepository.findOne(id);
    }

    @GetMapping(value = "/menu")
    public @ResponseBody
    Iterable<Dish> findAll(Iterable<String> name) {
        return userRepository.findAll(name);
    }
}