package com.possistemaecommerc.dtos.pedidos;

import com.possistemaecommerc.dtos.clientes.ClienteGetDTO;
import com.possistemaecommerc.dtos.produtos.ProdutoGetDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PedidoGetDTO {
    private Integer idPedido;
    private String codigoPedido;
    private String dataPedido;
    private Double valor;
    private ClienteGetDTO cliente;
    private List<ProdutoGetDTO> produtos;

}
