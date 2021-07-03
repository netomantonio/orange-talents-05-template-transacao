package br.com.zupacademy.transacoes.transacoes.responses;

import br.com.zupacademy.transacoes.transacoes.models.Estabelecimento;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EstabelecimentoResponse {

    @JsonProperty
    private String nome;
    @JsonProperty
    private String cidade;
    @JsonProperty
    private String endereco;

    public EstabelecimentoResponse(Estabelecimento estabelecimento) {
        this.nome = estabelecimento.getNome();
        this.cidade = estabelecimento.getCidade();
        this.endereco = estabelecimento.getEndereco();
    }
}
