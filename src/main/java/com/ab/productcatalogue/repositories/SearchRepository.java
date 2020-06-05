package com.ab.productcatalogue.repositories;

import com.ab.productcatalogue.models.Product;
import com.ab.productcatalogue.models.SearchCriteria;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */

@Repository
public interface SearchRepository {
    List<Product> searchProduct(SearchCriteria searchCriteria);
}
