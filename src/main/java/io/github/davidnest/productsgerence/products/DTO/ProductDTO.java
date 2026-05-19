package io.github.davidnest.productsgerence.products.DTO;

import io.github.davidnest.productsgerence.products.Entity.Product;

public record ProductDTO(
        Long id,
        String name,
        String description,
        double price) {
    public static ProductDTO fromEntity(Product product){
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }

}
