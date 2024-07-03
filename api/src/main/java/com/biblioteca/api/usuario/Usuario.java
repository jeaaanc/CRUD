package com.biblioteca.api.usuario;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.biblioteca.api.endereco.Endereco;

@Table(name = "usuario")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String nomedeexibicao;
    @Embedded
    private Endereco endereco;
    private Boolean ativo;

    public Usuario(CadastroDados dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.sobrenome = dados.sobrenome();
        this.email = dados.email();
        this.nomedeexibicao = dados.nomedeexibicao();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacao(AtualizarUsuario dados) {
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.sobrenome() != null){
            this.sobrenome = dados.sobrenome();
        }
        if (dados.nomedeexibicao() != null){
            this.nomedeexibicao = dados.nomedeexibicao();
        }
        if (dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }

    }

    public void excluir() {
        this.ativo = false;
    }
}
