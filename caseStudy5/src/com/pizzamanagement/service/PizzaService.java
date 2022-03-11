package com.pizzamanagement.service;

import com.pizzamanagement.model.Pizza;

public interface PizzaService {
	
	
	void addPizza(Pizza p );
	void updatePizza(Pizza p);
	void deletePizza(Pizza p);
	Pizza findPizzaByno(int pizzaNo);
	

}
