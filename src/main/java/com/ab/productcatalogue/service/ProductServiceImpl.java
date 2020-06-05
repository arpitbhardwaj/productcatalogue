package com.ab.productcatalogue.service;

import com.ab.productcatalogue.models.Product;
import com.ab.productcatalogue.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addProducts(List<Product> products) {
        products.forEach(product -> productRepository.save(product));
    }
}
