package com.example.simpleapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageResponse {
    
    @JsonProperty("message")
    private String message;
    
    public MessageResponse() {
    }
    
    public MessageResponse(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}