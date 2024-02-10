package com.possistemaecommerc.controllers;

import com.possistemaecommerc.dtos.auth.AuthGetDTO;
import com.possistemaecommerc.dtos.auth.AuthPostDTO;
import com.possistemaecommerc.dtos.clientes.ClienteGetDTO;
import com.possistemaecommerc.entities.Cliente;
import com.possistemaecommerc.entities.interfaces.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthController {

    @Autowired
    private IClienteRepository clienteRepository;
    //private final IClienteRepository clienteRepository;

    @PostMapping
    @ResponseBody
    public ResponseEntity<AuthGetDTO> post(@RequestBody AuthPostDTO dto)
    {
        try {
            Cliente cliente = clienteRepository.findByEmailAndSenha(dto.getEmail(),dto.getSenha());
            /*Cliente cliente = clienteRepository.findByEmailAndSenha(dto.getEmail(), Cryptography.criptografar(dto.getSenha()));*/
            if(cliente == null) { //não foi encontrado..
                return ResponseEntity.status
                        (HttpStatus.UNAUTHORIZED).body(null);
            }
            AuthGetDTO result = new AuthGetDTO();
            result.setAccessToken((cliente.getEmail()));
/*            result.setAccessToken(JwtToken
                    .generateToken(cliente.getEmail()));*/
            result.setCliente(new ClienteGetDTO());
            result.getCliente()
                    .setIdCliente(cliente.getIdCliente());
            result.getCliente().setNome(cliente.getNome());
            result.getCliente().setEmail(cliente.getEmail());
            result.getCliente().setCpf(cliente.getCpf());
            result.getCliente().setTelefone
                    (cliente.getTelefone());
            result.getCliente().setLogradouro
                    (cliente.getEndereco().getLogradouro());
            result.getCliente().setNumero
                    (cliente.getEndereco().getNumero());
            result.getCliente().setComplemento
                    (cliente.getEndereco().getComplemento());
            result.getCliente().setBairro
                    (cliente.getEndereco().getBairro());
            result.getCliente().setCidade
                    (cliente.getEndereco().getCidade());
            result.getCliente().setEstado
                    (cliente.getEndereco().getEstado());
            result.getCliente().setCep
                    (cliente.getEndereco().getCep());
            return ResponseEntity.status
                    (HttpStatus.OK).body(result);
        } catch (Exception e) {
            return ResponseEntity.status
                    (HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}

