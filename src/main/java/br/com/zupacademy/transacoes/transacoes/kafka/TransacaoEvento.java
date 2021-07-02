package br.com.zupacademy.transacoes.transacoes.kafka;

import br.com.zupacademy.transacoes.transacoes.models.Transacao;
import com.fasterxml.jackson.annotation.JsonAlias;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoEvento {
    private String id;
    private BigDecimal valor;
    private EstabelecimentoDto estabelecimento;
    @JsonAlias("cartao")
    private CartaoDto cartao;
    private LocalDateTime efetivadaEm;

    public Transacao toModel(){
        return new Transacao(this.id, this.valor, this.estabelecimento.toModel(), this.cartao.toModel(), this.efetivadaEm);
    }
}
