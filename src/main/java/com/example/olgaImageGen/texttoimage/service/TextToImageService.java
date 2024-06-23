package com.example.olgaImageGen.texttoimage.service;


import com.example.olgaImageGen.texttoimage.client.StabilityAIClient;
import com.example.olgaImageGen.texttoimage.dto.TextToImageRequest;
import com.example.olgaImageGen.texttoimage.dto.TextToImageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextToImageService {

    @Autowired
    private StabilityAIClient stabilityAIClient;

    public TextToImageResponse generateImageFromText(TextToImageRequest request) {
        return stabilityAIClient.generateImage(request.getText());
    }
}
