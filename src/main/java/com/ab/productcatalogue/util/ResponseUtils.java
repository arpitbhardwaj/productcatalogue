package com.ab.productcatalogue.util;

import com.ab.productcatalogue.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */

@Component
public class ResponseUtils {
    public static ResponseEntity<Object> createObjectResponse(List<Product> products, HttpStatus httpStatus) {
        return new ResponseEntity<>(products,httpStatus);
    }
}
