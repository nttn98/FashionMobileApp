package com.baki.backend.repository;

import com.baki.backend.model.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory, Integer> {
    Optional<Subcategory> findByName(String name);

    List<Subcategory> findByCategoryId(int categoryId);
}