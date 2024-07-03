package com.biblioteca.api.usuario;

import com.biblioteca.api.endereco.EnderecoDados;

public record CadastroDados(
        String nome,
        String sobrenome,
        String email,
        String nomedeexibicao,
        EnderecoDados endereco

) {
}