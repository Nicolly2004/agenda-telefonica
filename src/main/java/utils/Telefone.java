package utils;

public class Telefone {
    private String codigoPais;
    private String ddd;
    private String numero;

    public String toString(){
        return this.getCodigoPais() + "("+this.getDdd() + ")"+ this.getNumero();
    }

    public String getCodigoPais(){
        return  codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getDdd(){
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

