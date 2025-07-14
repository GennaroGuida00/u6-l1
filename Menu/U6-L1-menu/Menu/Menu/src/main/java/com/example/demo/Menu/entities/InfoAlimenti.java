package com.example.demo.Menu.entities;

public abstract class InfoAlimenti {
    private String Name;
    private double prezzo;
    private int calorie;

    public InfoAlimenti(String name, double prezzo, int calorie) {
        Name = name;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    public String getName() {
        return Name;
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
                "Name='" + Name + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie ;
    }
}
