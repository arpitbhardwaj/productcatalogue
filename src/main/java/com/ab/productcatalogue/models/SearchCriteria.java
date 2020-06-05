package com.ab.productcatalogue.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Arpit Bhardwaj
 */
@AllArgsConstructor
@Getter
public class SearchCriteria {
    private String brand;
    private String colour;
    private String size;
    private int price;


}
