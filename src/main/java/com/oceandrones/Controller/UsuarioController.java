package com.oceandrones.Controller;


import com.oceandrones.Usuario.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = {"https://oceandrones.vercel.app/", "http://localhost:3000"})

public class UsuarioController {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @PostMapping("/cadastrar")
    @Transactional
    @PreAuthorize("hasRole('ADMIN')")
    public void cadastroUsuario(@RequestBody @Valid RDadosCadastroUsuario dadosUsuario){
        usuarioRepository.save(new Usuario(dadosUsuario));
    }

    @GetMapping("/buscar")
    public ResponseEntity<RDadosListagemUsuario> lista(
        @RequestParam(name = "emailUsuario") String emailUsuario,
        @RequestParam(name = "senhaUsuario") String senhaUsuario,
        @PageableDefault(size = 1, sort = {"nomeUsuario"}) Pageable paginacao){

        Usuario usuario = usuarioRepository.findByEmailUsuarioAndSenhaUsuario(emailUsuario, senhaUsuario);
        //Usuario usuario = usuarioRepository.findAllByIdUsuario(long idUsuario, <paginacao>);

        if (usuario == null) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        RDadosListagemUsuario usuarioDados = new RDadosListagemUsuario(usuario);
        return ResponseEntity.ok(usuarioDados);
    }

    @PutMapping("/atualizar/{idUsuario}")
    @Transactional
    @PreAuthorize("hasRole('ADMIN')")
    public void atualizarUsuario(@PathVariable Long idUsuario, @RequestBody @Valid RDadosAtualizacaoUsuario dadosUsuario){
        var usuario = usuarioRepository.getReferenceById(idUsuario);
        usuario.atualizarUsuario(dadosUsuario);
    }

    @DeleteMapping("/deletar/{idUsuario}")
    @Transactional
    @PreAuthorize("hasRole('ADMIN')")
    public void deletarUsuario(@PathVariable Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }
}
