package com.goodpractices.demo.service.example2;

import com.goodpractices.demo.data.entity.Example2Entity;

public interface Example2Service {

    java.util.stream.Stream<Example2Entity> getAll(int pageIndex, int pageSize);

    Example2Entity getById(java.util.UUID id);

    Example2Entity create(Example2Entity entity);

}
