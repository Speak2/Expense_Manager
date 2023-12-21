package com.nahid.ExpenseManager.repository;

import com.nahid.ExpenseManager.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, String> {

}
