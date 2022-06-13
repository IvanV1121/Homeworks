package com.netcracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.netcracker.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByName(String name);
//    List<Employee> findByNameAndId(String name, Integer id);
    @Query(value = "select * from employee e where e.name = :name", nativeQuery = true)
    List<Employee> retrieveByName(@Param("name") String name);
}

