package com.ab.productcatalogue.controllers;

import com.ab.productcatalogue.models.SearchCriteria;
import com.ab.productcatalogue.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Arpit Bhardwaj
 */
@RestController
@RequestMapping("/api/v1")
public class ProductSearchController {

    @Autowired
    private SearchService searchService;


    public ResponseEntity<Object> searchProduct(@RequestParam(required = false) String colour,
                                                @RequestParam(required = false) String size,
                                                @RequestParam(required = false) String brand,
                                                @RequestParam(required = false) int price){
        SearchCriteria criteria = new SearchCriteria(brand,colour,size,price);
        searchService.getSearchedProducts(criteria);
        return null;
    }
}
