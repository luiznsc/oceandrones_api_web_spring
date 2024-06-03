package com.oceandrones.Usuario;


import jakarta.persistence.*;
import lombok.*;

@Table(name = "TB_USUARIO")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idUsuario")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "NOME_USUARIO", nullable = false)
    private String nomeUsuario;

    @Column(name = "SOBRENOME_USUARIO", nullable = false)
    private String sobrenomeUsuario;

    @Column(name = "CPF_USUARIO", nullable = false)
    private String cpfUsuario;

    @Column(name = "TEL_USUARIO", nullable = false)
    private String telUsuario;

    @Column(name = "EMAIL_USUARIO", nullable = false)
    private String emailUsuario;

    @Column(name = "SENHA_USUARIO", nullable = false)
    private String senhaUsuario;


    public Usuario(String cpfUsuario) {
        this();
        this.cpfUsuario = cpfUsuario;
    }

    public Usuario(RDadosCadastroUsuario dadosUsuario) {
        this.nomeUsuario = dadosUsuario.nomeUsuario();
        this.sobrenomeUsuario = dadosUsuario.sobrenomeUsuario();
        this.cpfUsuario = dadosUsuario.cpfUsuario();
        this.telUsuario = dadosUsuario.telUsuario();
        this.emailUsuario = dadosUsuario.emailUsuario();
        this.senhaUsuario = dadosUsuario.senhaUsuario();
    }

    public void atualizarUsuario(RDadosAtualizacaoUsuario dadosAtualizacaoUsuario) {
        if (dadosAtualizacaoUsuario.nomeUsuario() != null) {
            this.nomeUsuario = dadosAtualizacaoUsuario.nomeUsuario();
        }
        if (dadosAtualizacaoUsuario.sobrenomeUsuario() != null) {
            this.sobrenomeUsuario = dadosAtualizacaoUsuario.sobrenomeUsuario();
        }
        if (dadosAtualizacaoUsuario.telUsuario() != null) {
            this.cpfUsuario = dadosAtualizacaoUsuario.telUsuario();
        }
        if (dadosAtualizacaoUsuario.emailUsuario() != null) {
            this.emailUsuario = dadosAtualizacaoUsuario.emailUsuario();
        }
        if (dadosAtualizacaoUsuario.senhaUsuario() != null) {
            this.senhaUsuario = dadosAtualizacaoUsuario.senhaUsuario();
        }
    }

    public void excluirUsuario() {
        this.nomeUsuario = null;
        this.sobrenomeUsuario = null;
        this.cpfUsuario = null;
        this.telUsuario = null;
        this.emailUsuario = null;
        this.senhaUsuario = null;
    }
}
