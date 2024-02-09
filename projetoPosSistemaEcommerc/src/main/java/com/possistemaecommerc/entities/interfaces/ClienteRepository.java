package com.possistemaecommerc.entities.interfaces;

import com.possistemaecommerc.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
