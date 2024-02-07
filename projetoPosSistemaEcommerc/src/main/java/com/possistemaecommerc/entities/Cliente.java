package com.possistemaecommerc.entities;

import javax.persistence.*;

@Entity
@Table
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String senha;

//mapeaando a chave estrangeira, unique=true (um para um)
    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Endereco endereco;


    public Cliente() {
// TODO Auto-generated constructor stub
    }
    public Cliente(Integer idCliente, String nome, String email,
                   String cpf, String telefone, String senha,
                   Endereco endereco) {
        super();
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
        this.endereco = endereco;
    }
    public Integer getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", nome="
                + nome + ", email=" + email + ", cpf=" + cpf
                + ", telefone=" + telefone + ", senha=" + senha + "]";

    }
}
