package com.dscatalog.DsCatalog.services;

import com.dscatalog.DsCatalog.entities.Category;
import com.dscatalog.DsCatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
          return repository.findAll();
    }
}
