package br.com.alura.codechella.vendas.infrastructure.venda;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}