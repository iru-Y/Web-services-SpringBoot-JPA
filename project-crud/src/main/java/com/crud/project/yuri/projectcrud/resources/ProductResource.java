package com.crud.project.yuri.projectcrud.resources;

import com.crud.project.yuri.projectcrud.entites.Product;
import com.crud.project.yuri.projectcrud.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    @Autowired
    private ProductServices productServices;
    public ResponseEntity<List<Product>> findAll(){
        List<Product> products = productServices.findAll();
        return ResponseEntity.ok().body(products);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById (@PathVariable Long id){
        Product product = productServices.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
