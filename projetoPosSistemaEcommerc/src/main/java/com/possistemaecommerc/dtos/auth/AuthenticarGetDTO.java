package com.possistemaecommerc.dtos.auth;

import com.possistemaecommerc.dtos.clientes.ClienteGetDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticarGetDTO {
    private String mensagem;
    private String accessToken;
    private ClienteGetDTO cliente;
}
