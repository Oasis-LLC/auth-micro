package com.oasis.microservice.user;

import com.oasis.microservice.user.domain.Role;
import com.oasis.microservice.user.domain.User;
import com.oasis.microservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication implements CommandLineRunner {
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User admin = new User();
        admin.setFirstName("admin");
        admin.setPassword("admin");
        admin.setEmail("admin@email.com");
        admin.setRole(Role.ADMIN);

        userService.signup(admin);

        User customer = new User();
        customer.setFirstName("customer");
        customer.setPassword("customer");
        customer.setEmail("customer@email.com");
        customer.setRole(Role.CUSTOMER);

        userService.signup(customer);
    }
}
