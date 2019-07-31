package com.kapped.springbootjpa.service;

import com.kapped.springbootjpa.beans.User;
import com.kapped.springbootjpa.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    private UserRepository userRepository;

    public UserRepositoryCommandLineRunner(UserRepository userRepository ) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args){
        User user = new User(10002L,"Jane Doe", "Admin");
        userRepository.save(user);
        log.info("New User Created through UserRepository: " + user);

        final Optional<User> userWithId10002L = userRepository.findById(10002L);
        log.info("User Retrieved: " + userWithId10002L);

        List<User> users = userRepository.findAll();
        log.info("All Users Retrieved: " + users);
    }
}
