package com.biblioteca.api.endereco;

public record EnderecoDados(
        String rua,
        String bairro,
        String numero,
        String cep,
        String complemento,
        Cidade uf

) {
}