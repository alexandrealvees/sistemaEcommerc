/*
package com.possistemaecommerc.service;

import com.possistemaecommerc.entities.MD5Component;
import com.possistemaecommerc.entities.Usuario;
import com.possistemaecommerc.entities.interfaces.IUsuarioRepository;
import com.possistemaecommerc.entities.interfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Autowired
    private MD5Component md5Component;

    @Override
    public void criarConta(Usuario usuario) {

        Optional<Usuario> usuarioOptional=usuarioRepository.findByEmail(usuario.getEmail());

        if(usuarioOptional.isPresent()){
            throw  new IllegalArgumentException("O email informado já está cadastrado");
        }
        usuario.setSenha(md5Component.encrypt(usuario.getSenha()));
        usuario.setDataHoraCriacao(Instant.now());
        usuario.getDataHoraUltimaAlteracao();
        usuarioRepository.save(usuario);
    }


    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario recuperarSenha(String email) {
        return null;
    }
}
*/
