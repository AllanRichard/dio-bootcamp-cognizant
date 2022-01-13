package com.dio.primeiroprojeto.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem() {
        return "Nosso primeiro projeto Spring boot Web";
    }
}
