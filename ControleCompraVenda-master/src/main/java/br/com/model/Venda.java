package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Venda implements Serializable {

    @Id
    private int _id;
    private String descricao;
    private String data;
    private Produto produto;
    private Cliente cliente;

    public Venda() {
    }

    public Venda(int _id, String descricao, String data, Produto produto, Cliente cliente) {
        this._id = _id;
        this.descricao = descricao;
        this.data = data;
        this.produto = produto;
        this.cliente = cliente;
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
        descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}