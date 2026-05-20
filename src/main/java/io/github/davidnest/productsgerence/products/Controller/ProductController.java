package io.github.davidnest.productsgerence.products.Controller;


import io.github.davidnest.productsgerence.products.DTO.ProductDTO;
import io.github.davidnest.productsgerence.products.Entity.Product;
import io.github.davidnest.productsgerence.products.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product save(@RequestBody @Valid Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/batch")
    public List<Product> saveAll(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
        return productService.findById(id)
                .map(ProductDTO::fromEntity)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll() {
        List<ProductDTO> products = productService.findAllProducts()
                .stream()
                .map(ProductDTO::fromEntity)
                .toList();
        return ResponseEntity.ok(products);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody @Valid Product product) {
        return ResponseEntity.ok(productService.updateProduct(id, product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteByIds(@RequestBody List<Long> ids) {
        productService.deleteProductsByIds(ids);
        return ResponseEntity.noContent().build();
    }
}
