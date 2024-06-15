package com.goodpractices.demo.data.repository;

import com.goodpractices.demo.data.entity.Example1Entity;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Example1Repository extends ListCrudRepository<Example1Entity, Long> {
}
