package com.github.productservice.api.mapper.request;


import com.github.productservice.api.model.request.ProductDtoRequest;
import com.github.productservice.domain.model.Product;


public class ProductMapperRequest {

    private ProductMapperRequest() {

    }

    public static Product toEntity(final ProductDtoRequest dto) {
        return Product.builder()
                .name(dto.getName())
                .build();
    }
}
