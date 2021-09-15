package com.makhlouf.user_backend;

import com.makhlouf.user_backend.model.User;
import com.makhlouf.user_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserBackendApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserBackendApplication.class, args);
    }
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        this.userRepository
                .save(new User("makhlouf","Aroua","makhloufaroua@gmail.com"));
        this.userRepository
                .save(new User("latifa","haouech","latifa.haouech@gmail.com"));
        this.userRepository
                .save(new User("Joud","Aroua","joud@gmail.com"));

    }
}
