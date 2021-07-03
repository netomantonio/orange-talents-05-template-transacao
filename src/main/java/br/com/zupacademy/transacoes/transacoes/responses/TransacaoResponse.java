package br.com.zupacademy.transacoes.transacoes.responses;

import br.com.zupacademy.transacoes.transacoes.models.Transacao;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {

    @JsonProperty
    private BigDecimal valor;
    @JsonProperty
    private EstabelecimentoResponse estabelecimento;
    @JsonProperty
    private CartaoResponse cartao;
    @JsonProperty
    private LocalDateTime efetivadaEm;

    public TransacaoResponse(Transacao transacao) {
        this.valor = transacao.getValor();
        this.estabelecimento = new EstabelecimentoResponse(transacao.getEstabelecimento());
        this.cartao = new CartaoResponse(transacao.getCartao());
        this.efetivadaEm = transacao.getEfetivadaEm();
    }
}
