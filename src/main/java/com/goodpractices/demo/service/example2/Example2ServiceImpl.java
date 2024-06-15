package com.goodpractices.demo.service.example2;

import com.goodpractices.demo.data.entity.Example2Entity;
import com.goodpractices.demo.data.repository.Example2Repository;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class Example2ServiceImpl implements Example2Service {

    // <<-FIELDS->>
    private final Example2Repository example2Repository;

    // <<-CONSTRUCTOR->>
    public Example2ServiceImpl(Example2Repository example2Repository) {
        this.example2Repository = example2Repository;
    }

    // <<-METHODS->>
    @Override
    public java.util.stream.Stream<Example2Entity> getAll(int pageIndex, int pageSize) {
        var pageRequest = PageRequest.of(pageIndex, pageSize);
        return this.example2Repository
                .findAll(pageRequest)
                .stream();
    }

    @Override
    public Example2Entity getById(java.util.UUID id) {
        return this.example2Repository
                .findById(id)
                .orElseThrow();
    }

    @Override
    public Example2Entity create(Example2Entity entity) {
        return this.example2Repository.save(entity);
    }

}
