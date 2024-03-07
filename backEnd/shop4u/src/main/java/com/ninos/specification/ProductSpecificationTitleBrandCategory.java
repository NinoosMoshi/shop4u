package com.ninos.specification;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import com.ninos.model.entity.Brand;
import com.ninos.model.entity.Category;
import com.ninos.model.entity.Product;
import jakarta.persistence.criteria.Predicate;

@Component
public class ProductSpecificationTitleBrandCategory {

    public Specification<Product> getProducts(ProductSpecParams specParams){
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (specParams.getSearch() != null && !specParams.getSearch().isEmpty()){
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("title")),
                        "%" + specParams.getSearch().toLowerCase() + "%"));
            }
            if(specParams.getCategoryId() != 0){
                predicates.add(criteriaBuilder.equal(root.get("category"),
                        new Category(Long.valueOf(specParams.getCategoryId()))));
            }
            if(specParams.getBrandId() != 0){
                predicates.add(criteriaBuilder.equal(root.get("brand"),
                        new Brand(Long.valueOf(specParams.getBrandId()))));
            }
            if(specParams.getSort() != null && !specParams.getSort().isEmpty()) {
                switch(specParams.getSort()) {

                    case "priceAsc":
                        query.orderBy(criteriaBuilder.asc(root.get("unitPrice")));
                        break;

                    case "priceDesc":
                        query.orderBy(criteriaBuilder.desc(root.get("unitPrice")));
                        break;
                    default:
                        query.orderBy(criteriaBuilder.asc(root.get("title")));
                        break;

                }
            }

            return criteriaBuilder.and(predicates.toArray(Predicate[]::new));
        };


    }


}
