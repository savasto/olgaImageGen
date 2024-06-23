package com.example.olgaImageGen.texttoimage.controller;

import com.example.olgaImageGen.texttoimage.dto.TextToImageRequest;
import com.example.olgaImageGen.texttoimage.dto.TextToImageResponse;
import com.example.olgaImageGen.texttoimage.service.TextToImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/images")
public class TextToImageController {

    @Autowired
    private TextToImageService textToImageService;

    @PostMapping("/generate")
    public TextToImageResponse generateImageFromText(@RequestBody TextToImageRequest request) {
        return textToImageService.generateImageFromText(request);
    }
}
