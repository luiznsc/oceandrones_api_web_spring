package com.oceandrones.Usuario;

import com.oceandrones.Usuario.Usuario;

public record RDadosListagemUsuario(
        Long idUsuario,
        String nomeUsuario,
        String sobrenomeUsuario,
        String cpfUsuario,
        String emailUsuario
) {

    public RDadosListagemUsuario(Usuario usuario){
        this(usuario.getIdUsuario(), usuario.getNomeUsuario(), usuario.getSobrenomeUsuario(), usuario.getCpfUsuario(), usuario.getEmailUsuario());
    }
}
