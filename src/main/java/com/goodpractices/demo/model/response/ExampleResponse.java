package com.goodpractices.demo.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ExampleResponse(
        String name,
        @JsonProperty("additionalInfo")
        String moreInfo,
        @JsonProperty("number")
        Integer numberField
) {}
