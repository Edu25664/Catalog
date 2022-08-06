package com.dscatalog.DsCatalog.services;

import com.dscatalog.DsCatalog.DTO.CategoryDTO;
import com.dscatalog.DsCatalog.entities.Category;
import com.dscatalog.DsCatalog.repositories.CategoryRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional
    public List<CategoryDTO> findAll() {
        List<Category> lis = repository.findAll();
        return lis.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
       /*
       aqui é uma forma de converter objetos service para dto
         List<CategoryDTO> listdto = new ArrayList<>();
        for (Category cat : lis) {
            listdto.add(new CategoryDTO(cat));
        }
        */
    }
}
