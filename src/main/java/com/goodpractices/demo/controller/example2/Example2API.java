package com.goodpractices.demo.controller.example2;

import com.goodpractices.demo.model.request.ExampleRequest;
import com.goodpractices.demo.model.response.ExampleResponse;
import com.goodpractices.demo.model.response.PaginationParams;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping("/example-2")
public interface Example2API {

    /**
     * Example of documentation
     *
     * @param params pagination parameters
     * @return A {@link java.util.List<ExampleResponse>} with all entities paginated
     */
    @GetMapping(path = "", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(OK)
    java.util.List<ExampleResponse> getAll(@Valid PaginationParams params);

    /**
     * Example of documentation
     *
     * @param id the example unique identifier
     * @return .
     */
    @GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(OK)
    ExampleResponse getById(@PathVariable java.util.UUID id);

    /**
     * Creates a new entity
     *
     * @param requestBody the body information
     * @return .
     */
    @PostMapping(path = "/create", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(CREATED)
    ExampleResponse processRequest(@RequestBody @Valid ExampleRequest requestBody);

}
