package com.spring.data.jpa.repository;

import com.spring.data.jpa.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
