package com.ab.productcatalogue.service;

import com.ab.productcatalogue.models.Brand;
import com.ab.productcatalogue.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandRepository brandRepository;
    @Override
    public void addBrands(List<Brand> brands) {
        brands.forEach(brand -> brandRepository.save(brand));
    }
}
