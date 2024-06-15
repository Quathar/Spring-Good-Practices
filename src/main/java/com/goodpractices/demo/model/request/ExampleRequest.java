package com.goodpractices.demo.model.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ExampleRequest(
        @NotBlank
        String name,

        @NotBlank
        String secret,

        @NotBlank
        String moreInfo,

        @NotNull
        @Min(18)
        Integer numberField
) {}
