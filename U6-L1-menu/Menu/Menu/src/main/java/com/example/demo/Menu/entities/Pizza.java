package com.example.demo.Menu.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza extends InfoAlimenti {

    private List<String> ingredienti= new ArrayList<>(Arrays.asList("pomodoro","mozzarella"));

    public Pizza(String name, double prezzo, int calorie) {
        super(name, prezzo, calorie);

    }

    public void addIngredienti(Topping topping){
        ingredienti.add(topping.getName());
    };

    @Override
    public String toString() {
        return super.toString() +
                " { ingredienti=" + ingredienti + " }" ;
    }
}
