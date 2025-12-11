package com.example.store.services;

import com.example.store.entities.Product;
import com.example.store.persistence.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(Product p) {
        return productRepository.save(p);
    }

    public Product updateProduct(Integer id, Product updated) {
        return productRepository.findById(id).map(product -> {
            product.setName(updated.getName());
            product.setPrice(updated.getPrice());
            product.setQuantity(updated.getQuantity());
            return productRepository.save(product);
        }).orElse(null);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}