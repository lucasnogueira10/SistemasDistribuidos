package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Cliente implements Serializable {

    @Id
    private int _id;
    private String Nome;
    private String Telefone;
    private String CPF;

    public Cliente() {
    }

    public Cliente(int _id, String nome, String telefone, String CṔF) {
        this._id = _id;
        this.Nome = nome;
        this.Telefone = telefone;
        this.CPF = CPF;
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

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}