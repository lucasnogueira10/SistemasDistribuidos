package comum;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private static final long serialVersionUID= -3949965244431818150L;

    private int id;
    private String nome;
    private String telefone;
    private int idade;
    private String nomeMae;
    private String nomePai;
    private String endereco;
    private String cidade;
    private double salario;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) { this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) { this.idade = idade; }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String edereco) {
        this.endereco = edereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }


    public double calculaAumento(){
        if (this.idade <= 20) {
            this.salario = this.salario + (this.salario * 0.10);
            return this.salario;
        }
        if(this.idade > 20 && this.idade <= 30){
            this.salario = this.salario + (this.salario * 0.15);
            return this.salario;
        }
        if(this.idade > 30){
            this.salario = this.salario + (this.salario * 0.20);
            return this.salario;
        }
        return this.salario;

    }
}
