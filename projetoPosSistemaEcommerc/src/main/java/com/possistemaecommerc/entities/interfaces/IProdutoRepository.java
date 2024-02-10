package com.possistemaecommerc.entities.interfaces;

import com.possistemaecommerc.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<Produto,Integer> {
}
