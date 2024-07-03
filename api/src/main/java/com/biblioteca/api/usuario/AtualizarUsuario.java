package com.biblioteca.api.usuario;

import com.biblioteca.api.endereco.EnderecoDados;
import jakarta.validation.constraints.NotNull;

public record AtualizarUsuario(
        @NotNull
        Long id,
        String nome,
        String sobrenome,
        String nomedeexibicao,
        EnderecoDados endereco) {
}
