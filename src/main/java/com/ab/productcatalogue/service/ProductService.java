package com.ab.productcatalogue.service;

import com.ab.productcatalogue.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
@Service
public interface ProductService {
    void addProducts(List<Product> products);
}
