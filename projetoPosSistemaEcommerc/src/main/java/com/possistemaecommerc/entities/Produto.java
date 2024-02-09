package com.possistemaecommerc.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idProduto;

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double preco;

    @Column(length = 250, nullable = false)
    private String descricao;
    /*
     * Nome do atributo na classe Pedido
     * onde foi mapeado a @JoinTable
     */
    @ManyToMany(mappedBy = "produtos")
    private List<Pedido> pedidos;
}
