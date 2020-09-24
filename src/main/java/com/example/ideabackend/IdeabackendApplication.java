package com.example.ideabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(value = "com.example.ideabackend.dao")
@SpringBootApplication
public class IdeabackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdeabackendApplication.class, args);
    }

}
