package com.codewithmusashi.store;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class StoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
<<<<<<< HEAD
        return "welcome user - Updated at " + new java.util.Date();
=======
        return "pull request update - Updated at " + new java.util.Date();
>>>>>>> f4d95ecd83be634a3f80ad416a7dcc0745bc1963
    }
}