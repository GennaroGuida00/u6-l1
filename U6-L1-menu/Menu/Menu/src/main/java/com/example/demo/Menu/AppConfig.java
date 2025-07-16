package com.example.demo.Menu;

import com.example.demo.Menu.entities.*;
import com.example.demo.Menu.enums.StatoOrdine;
import com.example.demo.Menu.enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class AppConfig {
@Bean
    public Topping Ham(){
    return new Topping("Ham",0.50,250);
}
    @Bean
    public Topping Pineapple(){
        return new Topping("Pineapple",2.50,150);
    }
    @Bean
    public Topping Salami(){
        return new Topping("Salami",1.00,350);
    }
    @Bean
    public Topping Cheese(){
        Topping topping=new Topping("Cheese",1.00,149);
        return topping;
    }
    @Bean
    public Topping Onions(){
        Topping topping=new Topping("Onions",2.00,172);
        return topping;
    }


    @Bean
    public Pizza p1(){
    Pizza pizza = new Pizza("Hawaiian Pizza",6.49,1024);
        pizza.addIngredienti(Ham());
        pizza.addIngredienti(Pineapple());
        return pizza;
    }

    @Bean
    public Pizza p2(){
        Pizza pizza = new Pizza("Salami Pizza",5.99,1160);
        pizza.addIngredienti(Salami());
        return pizza;
    }

    @Bean
    public Pizza p3(){
        Pizza pizza = new Pizza("Margherita Pizza",4.99,1104);
        return pizza;
    }


    @Bean
    public Bevanda b1(){
    Bevanda bevanda =new Bevanda("Lemonade",1.29,128,0.33);
        return bevanda;
    }
    @Bean
    public Bevanda b2(){
        Bevanda bevanda =new Bevanda("Water",1.29,0,0.5);
        return bevanda;
    }

    @Bean
    public Bevanda b3(){
        Bevanda bevanda =new Bevanda("Wine",7.49,607,0.75);
        return bevanda;
    }

    @Bean

    public Ordine ordine1(Pizza p1,Pizza p3,Bevanda b1, Bevanda b3, Topping Onions){
        List<Pizza> pizze = List.of(p1, p3);
        List<Bevanda> bevande = List.of(b1, b3);
        List<Topping> toppings = List.of(Onions);
    return new Ordine(1,2,pizze,bevande,toppings, StatoOrdine.IN_CORSO, LocalDate.now());
    }

    public Ordine ordine2(Pizza p1,Bevanda b1, Bevanda b3, Topping Ham){
        List<Pizza> pizze = List.of(p1);
        List<Bevanda> bevande = List.of(b1, b3);
        List<Topping> toppings = List.of(Ham);
        return new Ordine(1,2,pizze,bevande,toppings, StatoOrdine.IN_CORSO, LocalDate.now());
    }

    @Bean
    public Tavolo tavolo1(@Qualifier("ordine1") Ordine ordine){
    return  new Tavolo(1,2, StatoTavolo.OCCUPATO,ordine);
    }



}
