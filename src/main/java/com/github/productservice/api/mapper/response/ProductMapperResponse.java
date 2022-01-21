package com.github.productservice.api.mapper.response;

import com.github.productservice.api.model.response.ProductDtoResponse;
import com.github.productservice.domain.model.Product;

public class ProductMapperResponse {

    private ProductMapperResponse() {

    }

    public static ProductDtoResponse toDto(final Product product) {
        return ProductDtoResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .build();
    }
}
