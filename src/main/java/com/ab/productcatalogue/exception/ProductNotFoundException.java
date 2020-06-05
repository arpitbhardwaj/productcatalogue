package com.ab.productcatalogue.exception;

/**
 * @author Arpit Bhardwaj
 */
public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
