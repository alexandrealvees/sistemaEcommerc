package com.possistemaecommerc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idEndereco;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    @OneToOne
//mapeaando a chave estrangeira, unique=true (um para um)
    @JoinColumn(name = "idCliente", nullable = false, unique = true)
    private Cliente cliente;
}
