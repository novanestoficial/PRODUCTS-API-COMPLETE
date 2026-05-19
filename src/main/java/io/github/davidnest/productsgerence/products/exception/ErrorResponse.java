package io.github.davidnest.productsgerence.products.exception;

public record ErrorResponse(
        int status,
        String message
) {}
