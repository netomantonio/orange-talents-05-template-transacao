package br.com.zupacademy.transacoes.transacoes.kafka;

import br.com.zupacademy.transacoes.transacoes.models.Estabelecimento;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EstabelecimentoDto {

    @JsonProperty
    private String nome;

    @JsonProperty
    private String cidade;

    @JsonProperty
    private String endereco;

    public Estabelecimento toModel() {
        return new Estabelecimento(this.nome,this.cidade,this.endereco);
    }
}
