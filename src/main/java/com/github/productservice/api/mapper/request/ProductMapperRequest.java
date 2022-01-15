package com.github.productservice.api.mapper.request;


import com.github.productservice.api.model.request.ProductDtoRequest;
import com.github.productservice.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapperRequest {

    Product toDomain(final ProductDtoRequest productDtoRequest);
}
