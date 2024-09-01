//package com.MyProject.productservice.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/auth")
//public class AuthController {
//
//@Autowired
//private UserRepository userRepository;
//
//@Autowired
//private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @PostMapping("/signin")
//    public ResponseEntity<?> signIn(@RequestBody SignInRequest signInRequest) {
//        User user = userRepository.findByEmail(signInRequest.getEmail());
//        if (user != null && bCryptPasswordEncoder.matches(signInRequest.getPassword(), user.getPassword())) {
//            return ResponseEntity.ok(new SignInResponse(true, "Login successful"));
//        } else {
//            return ResponseEntity.status(401).body(new SignInResponse(false, "Invalid credentials"));
//        }
//    }
//}
//
//class SignInRequest {
//    private String email;
//    private String password;
//    // Getters and setters...
//}
//
//class SignInResponse {
//    private boolean success;
//    private String message;
//    // Constructor, getters and setters...
//	}
//
//
//}
