package com.example.demo.Menu.entities;

public class Bevanda extends InfoAlimenti {
    private double lt;

    public Bevanda(String name, double prezzo, int calorie, double lt) {
        super(name, prezzo, calorie);
        this.lt = lt;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                " ,lt=" + lt;
    }
}
