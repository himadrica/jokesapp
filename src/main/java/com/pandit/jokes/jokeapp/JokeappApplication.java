package com.pandit.jokes.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:jokes-config.xml") // telling spring that this is xml based config and load all the bean declared in it
public class JokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeappApplication.class, args);
    }

}
