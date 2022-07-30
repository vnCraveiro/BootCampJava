package br.com.tiacademy.vendas.controller;

import br.com.tiacademy.vendas.domain.Vendedor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @GetMapping
    public ResponseEntity<List<Vendedor>> listar(){

        Vendedor um = new Vendedor();
        um.setId(1L);
        um.setNome("João");

        Vendedor dois = new Vendedor();
        um.setId(2L);
        um.setNome("Manuel");

        var vendedores = Arrays.asList(um, dois);
        return ResponseEntity.ok(vendedores);



    }



}
