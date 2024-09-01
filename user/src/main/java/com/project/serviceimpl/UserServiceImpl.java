//package com.project.serviceimpl;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
////import org.hibernate.validator.internal.util.logging.LoggerFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.project.DTO.UserDto;
//import com.project.entity.Role;
//import com.project.entity.User;
//import com.project.repository.RoleRepository;
//import com.project.repository.UserRepository;
//import com.project.service.UserService;
//
////import ch.qos.logback.classic.Logger;
//
//@Service
//public class UserServiceImpl implements UserService {
//	   private static final Logger logger = LoggerFactory.getLogger(UserService.class);
//
//    private UserRepository userRepository;
//    private RoleRepository roleRepository;
//    private PasswordEncoder passwordEncoder;
//
//    public UserServiceImpl(UserRepository userRepository,
//                           RoleRepository roleRepository,
//                           PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public void saveUser(UserDto userDto) {
//        User user = new User();
//        user.setUsername(userDto.getFirstName() + " " + userDto.getLastName());
//        user.setEmail(userDto.getEmail());
//        // encrypt the password using spring security
//        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
//        logger.info("Saving user: {}", userDto.getEmail());
//        // Conversion and save logic
//        logger.info("User saved successfully");
//
//        Role role = roleRepository.findByName("ROLE_ADMIN");
//        if(role == null){
//            role = checkRoleExist();
//        }
//        user.setRoles(Arrays.asList(role));
//        userRepository.save(user);
//    }
//
//    @Override
//    public User findUserByEmail(String email) {
//    	logger.info("Searching for user with email: {}", email);
//    	
//        return userRepository.findByEmail(email);
//    }
//
//    @Override
//    public List<UserDto> findAllUsers() {
//        List<User> users = userRepository.findAll();
//        logger.info("Fetching all users");
//        return users.stream()
//                .map((user) -> mapToUserDto(user))
//                .collect(Collectors.toList());
//    }
//
//    private UserDto mapToUserDto(User user){
//        UserDto userDto = new UserDto();
//        String[] str = user.getUsername().split(" ");
//        userDto.setFirstName(str[0]);
//        userDto.setLastName(str[1]);
//        userDto.setEmail(user.getEmail());
//        logger.info("saved succesfully");
//        return userDto;
//    }
//
//    private Role checkRoleExist(){
//        Role role = new Role();
//        role.setName("ROLE_ADMIN");
//        return roleRepository.save(role);
//    }
//}
