package com.example.simpleapp.controller;

import com.example.simpleapp.dto.MessageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<MessageResponse> home() {
        MessageResponse response = new MessageResponse("Hello from Backend!");
        return ResponseEntity.ok(response);
    }
}