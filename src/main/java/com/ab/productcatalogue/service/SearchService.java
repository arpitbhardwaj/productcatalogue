package com.ab.productcatalogue.service;

import com.ab.productcatalogue.models.Product;
import com.ab.productcatalogue.models.SearchCriteria;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
@Service
public interface SearchService {
    List<Product> getProductsBySku(String sku);
    List<Product> getSearchedProducts(SearchCriteria searchCriteria);
}
