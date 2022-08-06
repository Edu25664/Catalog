package com.dscatalog.DsCatalog.services;

import com.dscatalog.DsCatalog.DTO.CategoryDTO;
import com.dscatalog.DsCatalog.Exception.EntityNotFundException;
import com.dscatalog.DsCatalog.entities.Category;
import com.dscatalog.DsCatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional
    public List<CategoryDTO> findAll() {
        List<Category> lis = repository.findAll();
        return lis.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
    }

    @Transactional
    public CategoryDTO findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        Category entity = obj.orElseThrow(() -> new EntityNotFundException("Entity not found"));
        return new CategoryDTO(entity);
    }
}
