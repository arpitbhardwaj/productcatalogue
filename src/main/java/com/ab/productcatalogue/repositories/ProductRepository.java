package com.ab.productcatalogue.repositories;

import com.ab.productcatalogue.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Arpit Bhardwaj
 */

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
