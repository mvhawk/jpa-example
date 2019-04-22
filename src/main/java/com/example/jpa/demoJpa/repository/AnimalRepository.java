package com.example.jpa.demoJpa.repository;

import com.example.jpa.demoJpa.model.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animals,Long> {
}
