package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Compra implements Serializable {

    @Id
    private int _id;
    private String descricao;
    private Produto produto;
    private Fornecedor fornecedor;

    public Compra() {
    }

    public Compra(int _id, String descricao, Produto produto, Fornecedor fornecedor) {
        this._id = _id;
        this.descricao = descricao;
        this.produto = produto;
        this.fornecedor = fornecedor;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
