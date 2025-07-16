package com.example.demo.Menu.entities;

public abstract class InfoRistorante {
    private int id;
    private int numero_coperti;

    public InfoRistorante(int id, int numero_coperti) {
        this.id = id;
        this.numero_coperti = numero_coperti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_coperti() {
        return numero_coperti;
    }

    public void setNumero_coperti(int numero_coperti) {
        this.numero_coperti = numero_coperti;
    }

    @Override
    public String toString() {
        return "InfoRistorante{" +
                "id=" + id +
                ", numero_coperti=" + numero_coperti +
                '}';
    }
}
