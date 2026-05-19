package io.github.davidnest.productsgerence.products.Controller;


import io.github.davidnest.productsgerence.products.Entity.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public Product save(Product product) {

    }
}
