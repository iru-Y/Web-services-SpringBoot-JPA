package com.crud.project.yuri.projectcrud.services;

import com.crud.project.yuri.projectcrud.entites.Category;
import com.crud.project.yuri.projectcrud.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public List<Category> findByAll(){
        return categoryRepository.findAll();
    }
    public Category findByID(Long id){
        Optional<Category> list = categoryRepository.findById(id);
        return list.get();
    }
}
