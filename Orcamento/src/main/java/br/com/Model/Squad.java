package br.com.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Squad {

    @Id
    private Integer _id;
    private String nome;
    private Integer qtdPessoas;

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(Integer qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
}
