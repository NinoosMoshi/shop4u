package com.ninos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninos.model.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
