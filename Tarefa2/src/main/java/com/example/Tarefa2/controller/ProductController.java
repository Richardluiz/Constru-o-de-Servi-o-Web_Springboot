package com.example.Tarefa2.controller;

import com.example.Tarefa2.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

   @Autowired   
    private ProductService productService;  // ✅ Verifique que o nome está correto

    @GetMapping("/marcas")
    public String consultarMarcas() {
        return productService.consultarMarcas();  // ✅ Aqui estava "service.consultarMarcas()"
    }

    @GetMapping("/modelos/{marca}")
    public String consultarModelos(@PathVariable int marca) {
        return productService.consultarModelos(marca);
    }

    @GetMapping("/anos/{marca}/{modelo}")
    public String consultarAnos(@PathVariable int marca, @PathVariable int modelo) {
        return productService.consultarAnos(marca, modelo);
    }

    @GetMapping("/valor/{marca}/{modelo}/{ano}")
    public String consultarValor(@PathVariable int marca, @PathVariable int modelo, @PathVariable String ano) {
        return productService.consultarValor(marca, modelo, ano);
    }
}