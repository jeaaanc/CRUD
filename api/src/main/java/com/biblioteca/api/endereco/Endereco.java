package com.biblioteca.api.endereco;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class Endereco {

    private String rua;
    private String bairro;
    private String numero;
    private String cep;
    private String complemento;
    @Enumerated(EnumType.STRING)
    private Cidade uf;

    public Endereco(EnderecoDados dados) {
        this.rua = dados.rua();
        this.bairro = dados.bairro();
        this.numero = dados.numero();
        this.cep = dados.cep();
        this.complemento = dados.complemento();
        this.uf = dados.uf();
    }

    public void atualizarInformacoes(EnderecoDados dados) {
        if (dados.rua() != null) {
            this.rua = dados.rua();
        }
        if (dados.bairro() != null) {
            this.bairro = dados.bairro();
        }
        if (dados.numero() != null) {
            this.numero = dados.numero();
        }
        if (dados.cep() != null) {
            this.cep = dados.cep();
        }
        if (dados.complemento() != null) {
            this.complemento = dados.complemento();
        }
        if (dados.uf() != null) {
            this.uf = dados.uf();
        }
    }
}
