package com.ab.productcatalogue.controllers;

import com.ab.productcatalogue.models.Product;
import com.ab.productcatalogue.models.SearchCriteria;
import com.ab.productcatalogue.service.SearchService;
import com.ab.productcatalogue.util.ResponseUtils;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
@RestController
@RequestMapping("/api/v1")
public class ProductSearchController {

    @Autowired
    private SearchService searchService;

    @ApiOperation(value = "Search Products",notes = "This Api will get the products based on search parameters")
    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public ResponseEntity<Object> searchProduct(@RequestParam(required = false) String colour,
                                                @RequestParam(required = false) String size,
                                                @RequestParam(required = false) String brand,
                                                @RequestParam(required = false) int price){
        SearchCriteria criteria = new SearchCriteria(brand,colour,size,price);
        List<Product> products = searchService.getSearchedProducts(criteria);
        return ResponseUtils.createObjectResponse(products, HttpStatus.OK);
    }
}
