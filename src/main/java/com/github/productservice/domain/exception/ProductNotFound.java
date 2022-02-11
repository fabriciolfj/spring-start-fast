package com.github.productservice.domain.exception;

public class ProductNotFound extends RuntimeException {

    public ProductNotFound(final String msg, final Throwable cause) {
        super(msg, cause);
    }

    public ProductNotFound(final String msg) {
        super(msg);
    }
}
