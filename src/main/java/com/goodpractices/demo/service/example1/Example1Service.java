package com.goodpractices.demo.service.example1;

import com.goodpractices.demo.data.entity.Example1Entity;
import com.goodpractices.demo.data.repository.Example1Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Example1Service {

    @Autowired
    private Example1Repository example1Repository;

    public List<Example1Entity> getAll() {
        return this.example1Repository.findAll();
    }

    public java.util.Optional<Example1Entity> getById(Long id) {
        return this.example1Repository.findById(id);
    }

    public Example1Entity create(Example1Entity entityToCreate) {
        return this.example1Repository.save(entityToCreate);
    }

}
