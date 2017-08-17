package com.ua.cabare;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Collection;
import java.sql.SQLException;
import com.ua.cabare.Dish;
import com.ua.cabare.UserRepository;
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

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Dish> getAllDishes() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/get")
    public @ResponseBody
    Dish getOneDish(String id) {
        return userRepository.findOne(id);
    }

    @GetMapping(path = "/menu")
    public @ResponseBody Iterable<Dish> getAllByColumn(String name) {
        return userRepository.findAll(Iterable<Dish>);
    }
}