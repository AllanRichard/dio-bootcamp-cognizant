package com.dio.utilizandoBeans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro() {
        return new Livro();
    }
    // <bean id="livro" class="com.dio.utilizandoBeans.Livro">
    @Bean
    public AutorLivro getAutorLivro() {
        return new Autor();
    }
}
