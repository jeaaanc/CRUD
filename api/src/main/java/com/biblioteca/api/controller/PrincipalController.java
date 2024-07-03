package com.biblioteca.api.controller;

import com.biblioteca.api.usuario.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadastra")
public class PrincipalController {
    @Autowired
    private UsuarioRepository repository;
    @PostMapping
    @Transactional
    public void cadastra(@RequestBody @Valid CadastroDados dados){
        repository.save(new Usuario(dados));
    }

    @GetMapping
    public Page<ListagemDeUsuarios> lista(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(ListagemDeUsuarios::new);
    }

    @Transactional
    @PutMapping
    public void atualizar(@RequestBody @Valid AtualizarUsuario dados){
        var usuario = repository.getReferenceById(dados.id());
        usuario.atualizarInformacao(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var usuario = repository.getReferenceById(id);
        usuario.excluir();
    }
}
