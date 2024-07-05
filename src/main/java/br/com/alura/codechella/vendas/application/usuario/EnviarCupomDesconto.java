package br.com.alura.codechella.vendas.application.usuario;

import br.com.alura.codechella.vendas.infrastructure.usuario.Usuario;

public interface EnviarCupomDesconto {
    void enviaPara(Usuario usuario);
}
