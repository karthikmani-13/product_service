package com.project.DTO;


public class SignInResponse {

    private String message;
    private String token; // Optional, if you're using JWT or similar

    // Constructors
    public SignInResponse() {
    }

    public SignInResponse(String message) {
        this.message = message;
    }

    public SignInResponse(String message, String token) {
        this.message = message;
        this.token = token;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
