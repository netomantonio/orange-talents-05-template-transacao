package br.com.zupacademy.transacoes.transacoes.kafka;

import br.com.zupacademy.transacoes.transacoes.models.Transacao;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoEvento {

    @JsonProperty
    private String id;

    @JsonProperty
    private BigDecimal valor;

    @JsonProperty
    private EstabelecimentoDto estabelecimento;

    @JsonAlias("cartao")
    @JsonProperty
    private CartaoDto cartao;

    @JsonProperty
    private LocalDateTime efetivadaEm;

    public Transacao toModel(){
        return new Transacao(this.id, this.valor, this.estabelecimento.toModel(), this.cartao.toModel(), this.efetivadaEm);
    }
}
