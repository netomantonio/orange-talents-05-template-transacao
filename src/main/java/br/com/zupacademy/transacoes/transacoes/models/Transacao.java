package br.com.zupacademy.transacoes.transacoes.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id
    private String id;
    private BigDecimal valor;
    @ManyToOne(cascade = CascadeType.MERGE) @JoinColumn(name = "estabelecimento_id")
    private Estabelecimento estabelecimento;
    @ManyToOne(cascade = CascadeType.MERGE) @JoinColumn(name = "cartao_id")
    private Cartao cartao;
    private LocalDateTime efetivadaEm;
    private LocalDateTime dataTransacao;

    public Transacao(String id, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivada) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivada;
        this.dataTransacao = LocalDateTime.now();
    }

    @Deprecated
    public Transacao() {
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public LocalDateTime getDataTransacao() {
        return dataTransacao;
    }
}