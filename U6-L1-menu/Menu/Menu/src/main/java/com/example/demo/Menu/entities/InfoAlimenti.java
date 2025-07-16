package com.example.demo.Menu.entities;

public abstract class InfoAlimenti {
    private String name;
    private double prezzo;
    private int calorie;

    public InfoAlimenti(String name, double prezzo, int calorie) {
        this.name = name;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getCalorie() {
        return calorie;
    }



    @Override
    public String toString() {
        return
                "Name='" + name + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie ;
    }
}
