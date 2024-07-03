package com.biblioteca.api.usuario;



// Record que devolvem as informações necessárias para o Front-End.
public record ListagemDeUsuarios(Long id,String nome, String sobrenome, String nomedeexibicao, String email) {

    public ListagemDeUsuarios(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getSobrenome(), usuario.getNomedeexibicao(), usuario.getEmail());
      }
    }
