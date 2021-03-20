package hu.faceit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FaceitStatsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FaceitStatsApplication.class, args);
    }
}
