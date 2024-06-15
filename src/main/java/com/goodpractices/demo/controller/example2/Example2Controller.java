package com.goodpractices.demo.controller.example2;

import com.goodpractices.demo.data.entity.Example2Entity;
import com.goodpractices.demo.model.request.ExampleRequest;
import com.goodpractices.demo.model.response.ExampleResponse;
import com.goodpractices.demo.model.response.PaginationParams;
import com.goodpractices.demo.model.factory.MapperFactory;
import com.goodpractices.demo.service.example2.Example2Service;

import lombok.AllArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Example2Controller implements Example2API {

    private static final Logger log = LoggerFactory.getLogger(Example2Controller.class);

    // <<-FIELD->>
    private final Example2Service service;

    // <<-METHODS->>
    @Override
    public java.util.List<ExampleResponse> getAll(PaginationParams params) {
        log.info("Retrieving all entities with pageIndex {} & pageSize {}", params.page(), params.size());
        return this.service
                .getAll( params.page(), params.size() )
                .map(MapperFactory.getExampleResponse()::fromEntity)
                .toList();
    }

    @Override
    public ExampleResponse getById(java.util.UUID id) {
        log.info("Retrieving entity with ID {}", id);
        Example2Entity entity = this.service.getById(id);

        return MapperFactory.getExampleResponse().fromEntity(entity);
    }

    @Override
    public ExampleResponse processRequest(ExampleRequest requestBody) {
        Example2Entity entityToCreate = MapperFactory.setExampleRequest().toEntity(requestBody);

        log.info("Creating entity {}", requestBody);
        Example2Entity createdEntity = this.service.create(entityToCreate);

        return MapperFactory.getExampleResponse().fromEntity(createdEntity);
    }

}
