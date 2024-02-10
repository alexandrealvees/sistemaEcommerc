package com.possistemaecommerc.entities.interfaces;

import com.possistemaecommerc.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPedidoRepository extends JpaRepository<Pedido,Integer> {

 /*   @Query("Select from Pedido join Cliente on Pedido.id_pedido=Cliente.id_cliente where Cliente.id_cliente= Pedido.id_cliente")
    List<Pedido> findByCliente(@Param("pIdCliente") Integer idCliente);
*/}
