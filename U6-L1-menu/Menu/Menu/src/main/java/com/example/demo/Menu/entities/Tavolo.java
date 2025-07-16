package com.example.demo.Menu.entities;

import com.example.demo.Menu.enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Autowired;

public class Tavolo extends InfoRistorante{

    private StatoTavolo statoTavolo;
    private Ordine ordine;


    public Tavolo(int id, int numero_coperti, StatoTavolo statoTavolo, Ordine ordine) {
        super(id, numero_coperti);
        this.statoTavolo = statoTavolo;
        this.ordine = ordine;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Tavolo{" +
                "statoTavolo=" + statoTavolo +
                '}';
    }
}
