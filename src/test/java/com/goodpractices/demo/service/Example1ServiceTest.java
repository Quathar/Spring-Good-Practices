package com.goodpractices.demo.service;

import com.goodpractices.demo.data.entity.Example1Entity;
import com.goodpractices.demo.data.repository.Example1Repository;
import com.goodpractices.demo.service.example1.Example1Service;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
class Example1ServiceTest {

    @MockBean
    private Example1Repository example1Repository;

    @Autowired
    private Example1Service example1Service;

    @Test
    void test() {
        when( this.example1Repository.findAll() )
                .thenReturn( List.of(new Example1Entity()) );

        List<Example1Entity> data = this.example1Service.getAll();

        assertThat( data ).isNotEmpty();
    }

}
