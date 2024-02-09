package com.possistemaecommerc.controllers;

import com.possistemaecommerc.entities.Endereco;
import com.possistemaecommerc.entities.interfaces.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/endereco", produces = MediaType.APPLICATION_JSON_VALUE)
public class EnderecoController {
    @Autowired
    EnderecoRepository enderecoRepository;
    @GetMapping
    public ResponseEntity<List<Endereco>> getList() {
        return getList();
    }
}
