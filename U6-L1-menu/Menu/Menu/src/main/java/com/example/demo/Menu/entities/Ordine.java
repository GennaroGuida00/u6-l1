package com.example.demo.Menu.entities;

import com.example.demo.Menu.enums.StatoOrdine;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Ordine extends InfoRistorante{

    private List<Pizza> pizze=new ArrayList<>();
    private List<Bevanda> bevande =new ArrayList<>();
    private List<Topping> toppings =new ArrayList<>();

    private StatoOrdine statoOrdine;

    private LocalDate oraAcquisizione;

    @Value("${ristorante.costoCoperto}")
    private double costoCoperto;

    public Ordine(int id, int numero_coperti, List<Pizza> pizze, List<Bevanda> bevande, List<Topping> toppings, StatoOrdine statoOrdine, LocalDate oraAcquisizione) {
        super(id, numero_coperti);
        this.pizze = pizze;
        this.bevande = bevande;
        this.toppings = toppings;
        this.statoOrdine = statoOrdine;
        this.oraAcquisizione = oraAcquisizione;
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public LocalDate getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(LocalDate oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public double ImportoTotale(){
        double totalePizze = pizze.stream().mapToDouble(Pizza::getPrezzo).sum();
        double totaleBevande = bevande.stream().mapToDouble(Bevanda::getPrezzo).sum();
        double totaleToppings = toppings.stream().mapToDouble(Topping::getPrezzo).sum();

        return totalePizze + totaleBevande + totaleToppings+costoCoperto*getNumero_coperti();
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "pizze=" + pizze +
                ", bevande=" + bevande +
                ", toppings=" + toppings +
                ", statoOrdine=" + statoOrdine +
                ", oraAcquisizione=" + oraAcquisizione +
                '}';
    }
}
