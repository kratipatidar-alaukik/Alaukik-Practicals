package com.example.day39.service;

import com.example.day39.entity.User;
import com.example.day39.repository.UserRepository;
import com.example.day39.dto.RegisterRequest;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.example.day39.dto.LoginRequest;
import com.example.day39.dto.AuthResponse;


@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

   public UserService(UserRepository userRepository,
                   PasswordEncoder passwordEncoder,
                   JwtService jwtService) {

    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
    this.jwtService = jwtService;
}

    public String register(RegisterRequest request) {

        // Check whether username already exists
        if (usernameExists(request.getUsername())) {
            return "Username already exists!";
        }

        // Hash the password
        String encodedPassword =
                passwordEncoder.encode(request.getPassword());

        // Create new user
        User user = new User(
                request.getUsername(),
                encodedPassword,
                "EMPLOYEE"
        );

        // Save user in database
        userRepository.save(user);

        return "User registered successfully!";
    }

    public boolean usernameExists(String username) {
        return userRepository.findByUsername(username).isPresent();
    }
    public AuthResponse login(LoginRequest request) {

    var userOptional =
            userRepository.findByUsername(request.getUsername());

    if (userOptional.isEmpty()) {
        throw new RuntimeException("Invalid username or password!");
    }

    User user = userOptional.get();

    boolean passwordMatched = passwordEncoder.matches(
            request.getPassword(),
            user.getPassword()
    );

    if (!passwordMatched) {
        throw new RuntimeException("Invalid username or password!");
    }

    String token = jwtService.generateToken(
            user.getUsername(),
            user.getRole()
    );

    return new AuthResponse(token);
}
}