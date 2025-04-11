package dev.pr.reviewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrReviewerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrReviewerApplication.class, args);
        System.out.println("PrReviewerApplication started");
    }

}
