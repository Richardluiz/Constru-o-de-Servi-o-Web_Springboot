package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Tarefa2.model.Product;

public interface ProdutoRepository extends JpaRepository<Product, Long> {
}

