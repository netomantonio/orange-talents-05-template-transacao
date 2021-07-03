package br.com.zupacademy.transacoes.transacoes.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
public class Cartao {

    @Id
    private String id;
    @Email
    private String email;
    @OneToMany(mappedBy = "cartao")
    private List<Transacao> transacaoes;


    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public List<Transacao> getTransacaoes() {
        return transacaoes;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
