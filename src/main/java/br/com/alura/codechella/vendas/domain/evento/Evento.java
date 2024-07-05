package br.com.alura.codechella.vendas.domain.evento;

import br.com.alura.codechella.vendas.domain.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Evento {
    private UUID uuid;
    private Categoria categoria;
    private String descricao;
    private Endereco endereco;
    private LocalDateTime data;
    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    private Evento() {
        // Construtor privado para garantir a construção apenas através do Builder
    }

    public Evento(Categoria categoria, String descricao, Endereco endereco, LocalDateTime data) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.endereco = endereco;
        this.data = data;
        
        gerarIdentificadorUnico();
    }

    public static class Builder {
        private Evento evento;

        public Builder criar(Categoria categoria, String descricao) {
            evento = new Evento();
            evento.categoria = categoria;
            evento.descricao = descricao;
            return this;
        }

        public Builder comData(LocalDateTime data) {
            evento.data = data;
            return this;
        }

        public Builder comTiposDeIngresso(List<TipoIngresso> tiposIngresso) {
            evento.tipoIngressos = tiposIngresso;
            return this;
        }

        public Evento build() {
            return evento;
        }
    }

    private void gerarIdentificadorUnico() {
        this.uuid = UUID.randomUUID();
    }

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso) {
        this.tipoIngressos.add(tipoIngresso);
    }

    public Categoria getCategoria() {
        return categoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public LocalDateTime getData() {
        return data;
    }
    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }
}
