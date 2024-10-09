package com.sangarius.productmanagementapp.repository;

import com.sangarius.productmanagementapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}