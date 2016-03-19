package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import wiring.StubbedApplicationWiring;

@SpringBootApplication
public class StubApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{Application.class, StubbedApplicationWiring.class}, args);
    }
}
