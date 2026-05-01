package model;

public abstract class Persona {
    private String nome;
    private String cognome;

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }
}
