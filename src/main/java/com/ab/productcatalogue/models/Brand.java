package com.ab.productcatalogue.models;

import lombok.*;

import javax.persistence.*;

/**
 * @author Arpit Bhardwaj
 */
@Entity
@Table(schema = "PRODUCT_CATALOGUE")
@AllArgsConstructor
@Getter
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int brandId;
    @Column
    private String brandName;
}
