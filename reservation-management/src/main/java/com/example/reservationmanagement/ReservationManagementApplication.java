package com.example.reservationmanagement;

import com.example.sharekernel.SharedConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
@Import(SharedConfiguration.class)
public class ReservationManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationManagementApplication.class, args);
    }

}
