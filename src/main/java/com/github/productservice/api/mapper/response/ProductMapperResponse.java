package com.github.productservice.api.mapper.response;

import com.github.productservice.api.model.response.ProductDtoResponse;
import com.github.productservice.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapperResponse {

    ProductDtoResponse toDto(final Product product);
}
