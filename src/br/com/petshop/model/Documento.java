package br.com.petshop.model;

public class Documento {

    private int id;

    private String numero;

    public Documento() {
    }

    public Documento(int id, String numero) {
        this.id = id;
        this.numero = numero;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                '}';
    }
}
