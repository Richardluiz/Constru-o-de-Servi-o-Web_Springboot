package com.example.Tarefa2.service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class FipService {
   private final String API_URL = "https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/anos/2014-3";

   public String getFipData(){
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject(API_URL, String.class);
   }
}
