package br.com.zupacademy.transacoes.transacoes.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Estabelecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cidade;
    private String endereco;
    @OneToMany(mappedBy = "estabelecimento")
    private List<Transacao> transacoes;

    public Long getId() {
        return id;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public Estabelecimento(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public Estabelecimento() {
    }


    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }
}
