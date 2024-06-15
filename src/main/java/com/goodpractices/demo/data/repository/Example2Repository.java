package com.goodpractices.demo.data.repository;

import com.goodpractices.demo.data.entity.Example2Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Example2Repository extends JpaRepository<Example2Entity, java.util.UUID> {
}
