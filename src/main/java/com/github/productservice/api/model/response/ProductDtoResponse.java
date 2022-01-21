package com.github.productservice.api.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ProductDtoResponse {

    private Long id;
    private String name;
}
