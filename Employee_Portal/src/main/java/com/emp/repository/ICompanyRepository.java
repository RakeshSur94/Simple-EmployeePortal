package com.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.model.Company;

public interface ICompanyRepository extends JpaRepository<Company, Integer> {

}
