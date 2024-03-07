/*
package com.possistemaecommerc.entities.interfaces;

import com.possistemaecommerc.entities.Produto;
import com.possistemaecommerc.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<Usuario,String> {

    //@Query("{email : ?0}")
    Optional<Usuario> findByEmail(String email);

   // @Query("{email: ?0,senha : ?1}")
    Optional<Usuario> findByEmailAndSenha(String email,String senha);
}
*/
