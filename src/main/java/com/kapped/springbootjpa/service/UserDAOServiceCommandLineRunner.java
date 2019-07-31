package com.kapped.springbootjpa.service;

import com.kapped.springbootjpa.beans.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    private UserDAOService userDAOService;

    public UserDAOServiceCommandLineRunner(UserDAOService userDAOService) {
        this.userDAOService = userDAOService;
    }

    @Override
    public void run(String... args){
            User user = new User(10001L,"Mike Joe", "Admin");
            long insert = userDAOService.insert(user);
            log.info("New User Created through EntityManager: " + user);
    }
}
