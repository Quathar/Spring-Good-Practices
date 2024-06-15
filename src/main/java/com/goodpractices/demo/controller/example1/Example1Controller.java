package com.goodpractices.demo.controller.example1;

import com.goodpractices.demo.data.entity.Example1Entity;
import com.goodpractices.demo.data.model.EntityNotFound;
import com.goodpractices.demo.service.example1.Example1Service;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/example-1")
public class Example1Controller {

    @Autowired
    private Example1Service service;

    @GetMapping("")
    public ResponseEntity<List<Example1Entity>> getAll() {
         List<Example1Entity> exampleList = this.service.getAll();
         return ResponseEntity.ok(exampleList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Example1Entity> getById(@PathVariable Long id) {
        try {
            java.util.Optional<Example1Entity> entityOptional = this.service.getById(id);

            if (entityOptional.isEmpty()) throw new EntityNotFound();

            Example1Entity entity = entityOptional.get();
            return ResponseEntity.ok(entity);
        } catch (EntityNotFound e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Example1Entity> create(@RequestBody @Valid Example1Entity entity) {
        Example1Entity createdEntity = this.service.create(entity);
        return ResponseEntity.status(CREATED).body(createdEntity);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, ?>> handleExceptions(Exception e) {
        var body = Map.of(
                "code", "400"
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }

}
