package com.possistemaecommerc.controllers;

import com.possistemaecommerc.entities.Cliente;
import com.possistemaecommerc.entities.Endereco;
import com.possistemaecommerc.entities.interfaces.IClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClienteController {
    @Autowired
    private IClienteRepository clienteRepository;
//    private final IClienteRepository clienteRepository;

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> post() {
        return null;
    }
    @PutMapping
    @ResponseBody
    public ResponseEntity<String> put() {
        return null;
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
        return null;
    }
    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<String> getById(@PathVariable("id") Integer id) {
        return null;
    }
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Cliente>> getList() {
        return getList();
    }
}
