package com.ab.productcatalogue.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Arpit Bhardwaj
 */

@Entity
@Table(schema = "PRODUCT_CATALOGUE")
@AllArgsConstructor
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int productId;
    @Column
    private String productName;
    @Column
    private String sku;
    @Column
    private String colour;
    @Column
    private String size;
    @Column
    private String price;
    @Column
    private int brandId;
    @Column
    private ProductCategory category;
    @Column
    private int supplierId;
}
