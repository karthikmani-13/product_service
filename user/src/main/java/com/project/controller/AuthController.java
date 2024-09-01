//package com.project.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.project.DTO.UserDto;
//import com.project.entity.User;
//import com.project.service.UserService;
//
////import ch.qos.logback.core.model.Model;
//import jakarta.validation.Valid;
//
//@Controller
//public class AuthController {
//	
//	@Autowired
//	UserService userService;
//
//    // handler method to handle home page request
//    @GetMapping("/index")
//    public String home(){
//        return "index";
//    }
//
//    // handler method to handle user registration form request
//    @GetMapping("/register")
//    public String showRegistrationForm(Model model){
//        // create model object to store form data
//        UserDto user = new UserDto();
//        model.addAttribute("user", user);
//        System.out.println("user found!");
//        return "register";
//    }
// // handler method to handle user registration form submit request
//    @PostMapping("/register/save")
//    public String registration(@Valid @ModelAttribute("user") UserDto userDto,
//                               BindingResult result,
//                               Model model){
//        User existingUser = userService.findUserByEmail(userDto.getEmail());
//        System.out.println("user exist!");
//
//        if(existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()){
//            result.rejectValue("email", null,
//                    "There is already an account registered with the same email");
//        }
//
//        if(result.hasErrors()){
//            model.addAttribute("user", userDto);
//            return "/register";
//        }
//
//        userService.saveUser(userDto);
//        return "redirect:/register?success";
//    }
//    // handler method to handle list of users
//    @GetMapping("/users")
//    public String users(Model model){
//        List<UserDto> users = userService.findAllUsers();
//        System.out.println("users list:");
//        model.addAttribute("users", users);
//        return "users";
//    }
//    // handler method to handle login request
//    @GetMapping("/login")
//    public String login(){
//        return "login";
//    }
//
//}