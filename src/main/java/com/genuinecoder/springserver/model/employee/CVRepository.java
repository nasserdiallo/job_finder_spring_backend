package com.genuinecoder.springserver.model.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CVRepository extends JpaRepository<CV, Integer>{
    CV findById(int id);
    
}
