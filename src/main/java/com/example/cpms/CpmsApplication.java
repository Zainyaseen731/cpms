package com.example.cpms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.sql.SQLOutput;

@SpringBootApplication
public class CpmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CpmsApplication.class, args);
        System.out.println("check for connect to git and github");
    }
}
