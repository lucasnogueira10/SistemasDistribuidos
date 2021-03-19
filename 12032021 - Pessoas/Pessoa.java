package comum;

import java.io.Serializable;

public class Pessoa implements Serializable{

    private static final long serialVersionUID = -3494965244430818150L;

    private int id;
    private String nome;
    private String telefone;
    private String cidade;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade (String cidade) {
        this.cidade = cidade;
    }
}
