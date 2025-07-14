package com.example.demo.Menu.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Pizza> pizze=new ArrayList<>();
    List<Bevanda> bevanda =new ArrayList<>();

    public Menu(List<Pizza> pizze, List<Bevanda> bevanda) {
        this.pizze = pizze;
        this.bevanda = bevanda;
    }
}
