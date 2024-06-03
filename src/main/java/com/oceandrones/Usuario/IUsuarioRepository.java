package com.oceandrones.Usuario;

import com.oceandrones.Usuario.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    Page<Usuario> findAllByIdUsuario(Long idUsuario, Pageable paginacao);
    Usuario findByEmailUsuarioAndSenhaUsuario(String emailUsuario, String senhaUsuario);
}
