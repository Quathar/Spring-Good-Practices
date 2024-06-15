package com.goodpractices.demo.model.response;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record PaginationParams(
        @NotNull
        @Min(value = 0)
        Integer page,
        @NotNull
        @Min(value = 1)
        @Max(value = 100)
        Integer size
) {}
