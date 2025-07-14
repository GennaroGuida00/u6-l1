package com.example.demo.Menu;

import com.example.demo.Menu.entities.Bevanda;
import com.example.demo.Menu.entities.Pizza;
import com.example.demo.Menu.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {

		SpringApplication.run(MenuApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MenuApplication.class);

		System.out.println("PIZZE");
		Pizza pi3 =context.getBean("p3",Pizza.class);
		System.out.println(pi3);

		Pizza pi1 =context.getBean("p1",Pizza.class);
		System.out.println(pi1);

		Pizza pi2 =context.getBean("p2",Pizza.class);
		System.out.println(pi2);


		System.out.println("TOPPINGS");

		Topping t1=context.getBean("Cheese", Topping.class);
		System.out.println(t1);
		Topping t2=context.getBean("Ham", Topping.class);
		System.out.println(t2);
		Topping t3=context.getBean("Onions", Topping.class);
		System.out.println(t3);
		Topping t4=context.getBean("Pineapple", Topping.class);
		System.out.println(t4);
		Topping t5=context.getBean("Salami", Topping.class);
		System.out.println(t5);


		System.out.println("DRINKS");
		Bevanda be1=context.getBean("b1", Bevanda.class);
		System.out.println(be1);
		Bevanda be2=context.getBean("b2", Bevanda.class);
		System.out.println(be2);
		Bevanda be3=context.getBean("b3", Bevanda.class);
		System.out.println(be3);

	}

}
