package com.example.employeedetails.Repository;

import com.example.employeedetails.entity.emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ERepository extends JpaRepository<emp,Long> {
}
