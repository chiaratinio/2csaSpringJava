package com.csa.samplefullstack.repository;

import com.csa.samplefullstack.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}

