package com.example.demo.Menu;

import com.example.demo.Menu.entities.Menu;
import com.example.demo.Menu.entities.Ordine;
import com.example.demo.Menu.entities.Tavolo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuRunner implements CommandLineRunner {

    private Menu menu;
    private Ordine ordine;
    private Tavolo tavolo;

    public MenuRunner(Menu menu, Ordine ordine, Tavolo tavolo) {
        this.menu = menu;
        this.ordine = ordine;
        this.tavolo = tavolo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(menu);
        System.out.println(ordine);
        System.out.println("Totale: "+ordine.ImportoTotale());
        System.out.println(tavolo);
    }
}
