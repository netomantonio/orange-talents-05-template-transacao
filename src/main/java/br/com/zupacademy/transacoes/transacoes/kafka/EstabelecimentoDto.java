package br.com.zupacademy.transacoes.transacoes.kafka;

import br.com.zupacademy.transacoes.transacoes.models.Estabelecimento;

public class EstabelecimentoDto {
    private String nome;
    private String cidade;
    private String endereco;

    public Estabelecimento toModel() {
        return new Estabelecimento(this.nome,this.cidade,this.endereco);
    }
}
