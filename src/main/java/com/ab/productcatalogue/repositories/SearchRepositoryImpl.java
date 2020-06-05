package com.ab.productcatalogue.repositories;

import com.ab.productcatalogue.models.Brand;
import com.ab.productcatalogue.models.Product;
import com.ab.productcatalogue.models.SearchCriteria;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */

@Repository
public class SearchRepositoryImpl implements SearchRepository {
    @PersistenceContext
    public EntityManager entityManager;
    @Override
    public List<Product> searchProduct(SearchCriteria searchCriteria) {
        List<Product> result = null;

        try{
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<Product> query = cb.createQuery(Product.class);
            Root<Product> productRoot = query.from(Product.class);
            List<Predicate> predicateList = new ArrayList<Predicate>();

            if (!StringUtils.isEmpty(searchCriteria.getBrand())){
                Join<Product, Brand> join = productRoot.join("brand", JoinType.INNER);
                predicateList.add(cb.equal(join.get("brandName"),searchCriteria.getBrand()));
            }

            query.where(cb.and(predicateList.toArray(new Predicate[predicateList.size()])));
            result = entityManager.createQuery(query).getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
