package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Produto implements Serializable {

    @Id
    private int _id;
    private String Nome;

    public Produto() {
    }

    public Produto(int _id, String Nome) {
        this._id = _id;
        this.Nome = Nome;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}