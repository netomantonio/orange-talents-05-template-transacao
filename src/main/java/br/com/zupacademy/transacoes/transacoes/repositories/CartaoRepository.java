package br.com.zupacademy.transacoes.transacoes.repositories;

import br.com.zupacademy.transacoes.transacoes.models.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, String> {
}
