package com.example.Tarefa2.service;
import com.example.Tarefa2.model.Product;

import com.example.Tarefa2.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductionService {

    @Autowired
    private ProductRepository  productRepository;

    // Método para adicionar um novo produto
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Método para obter todos os produtos
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Método para obter um produto pelo ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Método para atualizar um produto
    public Product updateProduct(Long id, Product updatedProduct) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setName(updatedProduct.getName());
                    product.setPrice(updatedProduct.getPrice());
                    return productRepository.save(product);
                })
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com ID: " + id));
    }

    // Método para deletar um produto pelo ID
    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new RuntimeException("Produto não encontrado com ID: " + id);
        }
        productRepository.deleteById(id);
    }
}