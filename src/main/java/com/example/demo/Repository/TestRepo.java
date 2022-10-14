package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.Test;

@Repository
public interface TestRepo extends JpaRepository<Test, Integer> {
    
}
