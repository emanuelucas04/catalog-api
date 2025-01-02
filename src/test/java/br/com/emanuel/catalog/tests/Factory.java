package br.com.emanuel.catalog.tests;

import br.com.emanuel.catalog.dto.ProductDTO;
import br.com.emanuel.catalog.entities.Category;
import br.com.emanuel.catalog.entities.Product;

import java.time.Instant;

public class Factory {

    public static Product createProduct() {
        Product product = new Product(1L, Instant.parse("2025-01-01T03:00:00Z"), "https://img.com/img.png", 800.0, "Good Phone", "Phone");
        product.getCategories().add(new Category(2L, "Electronics"));
        return product;
    }

    public static ProductDTO createProductDTO() {
        Product product = createProduct();
        return new ProductDTO(product, product.getCategories());
    }
}
