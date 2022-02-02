package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

	Department findByDepartmentId(Long id);

}
