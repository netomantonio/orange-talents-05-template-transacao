package br.com.zupacademy.transacoes.transacoes.kafka;

import br.com.zupacademy.transacoes.transacoes.models.Cartao;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CartaoDto {

    @JsonProperty
    private String id;

    @JsonProperty
    private String email;

    public Cartao toModel(){
        return new Cartao(this.id, this.email);
    }
}
