package com.ab.productcatalogue.service;

import com.ab.productcatalogue.models.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
@Service
public interface BrandService {
    void addBrands(List<Brand> brands);
}
