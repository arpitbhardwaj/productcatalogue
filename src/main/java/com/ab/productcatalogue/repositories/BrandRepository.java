package com.ab.productcatalogue.repositories;

import com.ab.productcatalogue.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Arpit Bhardwaj
 */

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
