package models;

import utils.Telefone;

public class Pessoa {
    private String nome;
    private Telefone telefone;




    public String toString(){
        return "Nome: "+ this.getNome() + "\n"+
                "Telefone: " + this.getTelefone();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTelefone(){
        return telefone ;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}
