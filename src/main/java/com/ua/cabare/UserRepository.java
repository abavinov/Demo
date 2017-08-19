package com.ua.cabare;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.Collection;
import com.ua.cabare.Dish;

public interface UserRepository extends CrudRepository<Dish, String> {
    public List<Dish> findDishesByName(String name);


    }
