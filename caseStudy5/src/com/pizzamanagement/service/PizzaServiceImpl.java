package com.pizzamanagement.service;


import com.pizzamanagement.Dao.PizzaDao;
import com.pizzamanagement.Dao.PizzaDaoImpl;
import com.pizzamanagement.model.Pizza;

public class PizzaServiceImpl implements PizzaService {
	
	
	private PizzaDao dao;    // creating dao object to accesss dao class methods
	
	public PizzaServiceImpl() {
		
		dao=new PizzaDaoImpl();  //initialize the object in the constructors
		
	}
	@Override
 public	void addPizza(Pizza p ) {
		
		dao.beginTransaction();
		dao.addPizza(p);
		dao.commitTransaction();
	}
	@Override
public	void updatePizza(Pizza p) {
		dao.beginTransaction();
		dao.updatePizza(p);
		dao.commitTransaction();
	}
	@Override
public	void deletePizza(Pizza p) {
	dao.beginTransaction();
	dao.deletePizza(p);
	dao.commitTransaction();
	}
	@Override
    public Pizza findPizzaByno(int pizzaNo) {
		//no need of transaction, it read option only
		Pizza p=dao.findPizzaByno(pizzaNo);
		return p;
}
	}
