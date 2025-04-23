package com.application.donev.project.services;

import com.application.donev.project.dtos.UserDTO;
import com.application.donev.project.errors.EmailAlreadyExists;
import com.application.donev.project.models.User;
import com.application.donev.project.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void saveUser(User user){
        String email = user.getEmail();

        encodePassword(user);
        validateEmail(email);

        this.userRepository.save(user);
    }

    public User registerUser(UserDTO userDTO){
        User newUser = new User(userDTO);

        saveUser(newUser);

        return newUser;
    }

    public void encodePassword(User user){
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
    }

    public boolean validatePassword(String passwordForm, String passwordDatabase){
        return this.passwordEncoder.matches(passwordForm, passwordDatabase);
    }

    public void validateEmail(String email){
        if(this.userRepository.existsByEmail(email)){
            throw new EmailAlreadyExists();
        }

    }

}
