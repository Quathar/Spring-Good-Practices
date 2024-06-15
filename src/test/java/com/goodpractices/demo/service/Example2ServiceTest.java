package com.goodpractices.demo.service;

import com.goodpractices.demo.data.entity.Example2Entity;
import com.goodpractices.demo.data.repository.Example2Repository;
import com.goodpractices.demo.service.example2.Example2Service;
import com.goodpractices.demo.service.example2.Example2ServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class Example2ServiceTest {

    @Mock
    private Example2Repository example2Repository;

    private Example2ServiceImpl example2Service;

    @BeforeEach
    public void setUp() {
        openMocks(this); // Initializes mocks
        this.example2Service = new Example2ServiceImpl(this.example2Repository); // Injects mock dependency
    }

    @Test
    void test() {
        when( this.example2Repository.findAll(PageRequest.of(0, 1)) )
                .thenReturn(new PageImpl<>(List.of(new Example2Entity())) );

        java.util.stream.Stream<Example2Entity> data = this.example2Service.getAll(0, 1);

        assertThat( data.toList() ).isNotEmpty();
    }
}
