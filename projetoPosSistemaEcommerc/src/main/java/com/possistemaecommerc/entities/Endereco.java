package com.possistemaecommerc.entities;


import javax.persistence.*;
@Entity
@Table
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
    public Endereco() {
// TODO Auto-generated constructor stub
    }
    public Endereco(Integer idEndereco, String logradouro,
                    String numero, String complemento, String bairro,
                    String cidade, String estado, String cep, Cliente cliente) {
        super();
        this.idEndereco = idEndereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.cliente = cliente;
    }
    public Integer getIdEndereco() {
        return idEndereco;
    }
    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString() {
        return "Endereco [idEndereco=" + idEndereco + ", logradouro="
                + logradouro + ", numero=" + numero
                + ", complemento=" + complemento + ", bairro=" + bairro
                + ", cidade=" + cidade + ", estado=" + estado
                + ", cep=" + cep + "]";

    }
}
