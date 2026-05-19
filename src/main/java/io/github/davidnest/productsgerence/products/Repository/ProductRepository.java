package io.github.davidnest.productsgerence.products.Repository;


import io.github.davidnest.productsgerence.products.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
