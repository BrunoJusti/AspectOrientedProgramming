package com.example.aop;

import com.example.aop.dummy.DummyService;
import com.example.aop.hello.HelloService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// Proxy objeto intermediário usado para inteceptar chamadas

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Bean
    //ApplicationRunner executa o código após a inicialização
    ApplicationRunner runner(HelloService hs, DummyService ds) {
        return args -> {
            hs.hello();
            ds.dummy();
        };
    }
}
