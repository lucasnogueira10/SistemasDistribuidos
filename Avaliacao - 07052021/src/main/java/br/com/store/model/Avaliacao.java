package br.com.store.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;

@Document
public class Avaliacao implements Serializable {

    @Id
    private int _id;
    private String descricao;
    private double nota;
    private String nomeAluno;

    public Avaliacao(){}

    public Avaliacao(int _id, String descricao, double nota, String nomeAluno) {
        this._id = _id;
        this.descricao = descricao;
        this.nota = nota;
        this.nomeAluno = nomeAluno;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
}
