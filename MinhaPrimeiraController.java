package br.com.karina.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                          //criar uma rota(path)
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController{   //classe designada para ser a primeira camada de acesso do usuário
   @GetMapping("/primeiroMetodo")
   
    public String primeiraMensagem(){   //metodo de uma classe(funcionalidade)
        return "Funcionou";
    }
}