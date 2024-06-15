package com.goodpractices.demo.model.factory;

import com.goodpractices.demo.model.mapper.ExampleRequestMapper;
import com.goodpractices.demo.model.mapper.ExampleResponseMapper;

import static org.mapstruct.factory.Mappers.getMapper;

/**
 * Factory with interface
 */
public interface MapperFactory {

    static ExampleResponseMapper getExampleResponse() {
        return getMapper(ExampleResponseMapper.class);
    }

    static ExampleRequestMapper setExampleRequest() {
        return getMapper(ExampleRequestMapper.class);
    }

}
