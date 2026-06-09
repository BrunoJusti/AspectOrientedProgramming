package com.example.aop.hello;

import org.springframework.stereotype.Service;

// Service registra a classe de serviço como bean
/*
* um bean é simplesmente um objeto Java já instanciado, configurado e gerenciado pelo Spring.
* em vez de criar objetos manualmente usando o operador new, voce delega essa
* tarefa ao spring, que se encarrega de injetar as dependencias e controlar todos os ciclos de vida
* do objeto
* */
@Service
public class HelloService {

    public void hello() {
        System.out.println("Hello");
    }
}
