package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Fornecedor implements Serializable {

    @Id
    private int _id;
    private String nome;
    private String telefone;
        private String CNPJ;

    public Fornecedor() {
    }

    public Fornecedor(int _id, String nome, String telefone, String CNPJ) {
        this._id = _id;
        this.nome = nome;
        this.telefone = telefone;
        this.CNPJ = CNPJ;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
