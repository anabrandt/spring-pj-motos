package br.com.fiap.springpjmotos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Entity
public class SpringPjMotosApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringPjMotosApplication.class, args );
    }

}
