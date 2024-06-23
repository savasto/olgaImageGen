package com.example.olgaImageGen.texttoimage.client;

import com.example.olgaImageGen.texttoimage.dto.TextToImageResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

@Component
public class StabilityAIClient {

    @Value("${stability.ai.api.url}")
    private String apiUrl;

    @Value("${stability.ai.api.key}")
    private String apiKey;

    public TextToImageResponse generateImage(String text) {
        RestTemplate restTemplate = new RestTemplate();
        // Assuming Stability AI API expects a JSON payload with text field
        String requestBody = "{\"text\":\"" + text + "\"}";
        //HttpHeaders headers = new HttpHeaders();
       // headers.set("Authorization", "Bearer " + apiKey);
       // headers.setContentType(MediaType.APPLICATION_JSON);

        //HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        HttpEntity<String> entity = new HttpEntity<>(requestBody);
        ResponseEntity<TextToImageResponse> response = restTemplate.postForEntity(apiUrl, entity, TextToImageResponse.class);

        return response.getBody();
    }
}
