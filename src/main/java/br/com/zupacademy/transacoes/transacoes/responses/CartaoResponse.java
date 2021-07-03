package br.com.zupacademy.transacoes.transacoes.responses;

import br.com.zupacademy.transacoes.transacoes.models.Cartao;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CartaoResponse {

    @JsonProperty
    private String id;

    @JsonProperty
    private String email;

    public CartaoResponse(Cartao cartao) {
        this.id = cartao.getId();
        this.email = cartao.getEmail();
    }
}
