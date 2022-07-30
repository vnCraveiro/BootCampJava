package br.com.tiacademy.vendas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    public ResponseEntity<String> nomeCliente(){
        return ResponseEntity.ok("Cliente cadastrado");
    }
}
