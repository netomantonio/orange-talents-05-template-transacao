package br.com.zupacademy.transacoes.transacoes.kafka;

import br.com.zupacademy.transacoes.transacoes.models.Cartao;

public class CartaoDto {
    private String id;
    private String email;

    public Cartao toModel(){
        return new Cartao(this.id, this.email);
    }
}
