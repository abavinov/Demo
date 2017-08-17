package com.ua.cabare;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ua.cabare.Dish;

public interface UserRepository extends CrudRepository<Dish, String> {
    //@Override List<Dish> findAll();
    }
