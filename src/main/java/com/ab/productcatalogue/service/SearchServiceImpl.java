package com.ab.productcatalogue.service;

import com.ab.productcatalogue.exception.ProductNotFoundException;
import com.ab.productcatalogue.models.Product;
import com.ab.productcatalogue.models.SearchCriteria;
import com.ab.productcatalogue.repositories.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
@Service
public class SearchServiceImpl implements SearchService{

    @Autowired
    private SearchRepository searchRepository;

    @Override
    public List<Product> getProductsBySku(String sku) {
        return null;
    }

    @Override
    public List<Product> getSearchedProducts(SearchCriteria searchCriteria) {
        List<Product> products = searchRepository.searchProduct(searchCriteria);
        if (CollectionUtils.isEmpty(products)){
            throw new ProductNotFoundException("No Products found for the given search");
        }
        return products;
    }
}
