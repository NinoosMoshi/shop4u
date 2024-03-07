package com.ninos.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brandId;

    private String brandName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brand")
    private Set<Product> products = new HashSet<>();

    public Brand(String brandName) {
        this.brandName = brandName;
    }

    public Brand(Long brandId) {
        this.brandId = brandId;
    }
}
