package com.oceandrones.Usuario;

public record RDadosCadastroUsuario(
        String nomeUsuario,
        String sobrenomeUsuario,
        String cpfUsuario,
        String telUsuario,
        String emailUsuario,
        String senhaUsuario
) {
}
