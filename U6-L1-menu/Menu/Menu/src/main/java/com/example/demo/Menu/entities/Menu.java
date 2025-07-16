package com.example.demo.Menu.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Menu {
    private List<Pizza> pizze=new ArrayList<>();
    private List<Bevanda> bevande =new ArrayList<>();
    private List<Topping> toppings =new ArrayList<>();

    @Autowired
    public Menu(List<Pizza> pizze, List<Bevanda> bevande, List<Topping> toppings) {
        this.pizze = pizze;
        this.bevande = bevande;
        this.toppings = toppings;
    }

    public void addPizze(Pizza p){
        pizze.add(p);
    }

    public void addBevande(Bevanda b){
        bevande.add(b);
    }
    public void addToppings(Topping t){
        toppings.add(t);
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public List<Bevanda> getBevande() {
        return bevande;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", bevande=" + bevande +
                ", toppings=" + toppings +
                '}';
    }
}
