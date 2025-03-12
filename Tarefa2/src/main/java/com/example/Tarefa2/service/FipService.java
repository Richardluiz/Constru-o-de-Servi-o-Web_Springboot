package com.example.Tarefa2.service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class FipService {
   private final String API_URL = "https://api.exemplo.com/fip";

   public String getFipData(){
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject(API_URL, String.class);
   }
}
