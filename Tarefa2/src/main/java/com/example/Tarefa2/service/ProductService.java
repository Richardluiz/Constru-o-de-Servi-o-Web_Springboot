package com.example.Tarefa2.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    private String consultarURL(String apiUrl) {
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {  // Corrigido aqui
            dados = response.getBody();
        } else {
            dados = "Falha ao obter dados. Código de status: " + response.getStatusCode();
        }
        return dados;
    }

    public String consultarMarcas() {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas");
    }

    public String consultarModelos(int id) {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + id + "/modelos");
    }

    public String consultarAnos(int idMarca, int idModelo) {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + idMarca + "/modelos/" + idModelo + "/anos");
    }

    public String consultarValor(int idMarca, int idModelo, String ano) {
        return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + idMarca + "/modelos/" + idModelo + "/anos/" + ano);
    }
}
