package com.ab.productcatalogue.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;

/**
 * @author Arpit Bhardwaj
 */
@Entity
@Table(schema = "PRODUCT_CATALOGUE")
@AllArgsConstructor
@Getter
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int supplierId;
    @Column
    private String supplierName;
}
