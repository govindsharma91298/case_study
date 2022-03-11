package com.pizzamanagement.Dao;

import com.pizzamanagement.model.Pizza;

public interface PizzaDao {
	
	
	void addPizza(Pizza p );
	void updatePizza(Pizza p);
	void deletePizza(Pizza p);
	Pizza findPizzaByno(int pizzaNo);
void commitTransaction();
	
	void beginTransaction();


}
