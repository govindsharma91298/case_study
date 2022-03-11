package com.pizzamanagement.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.pizzamanagement.model.Pizza;

public class PizzaDaoImpl implements PizzaDao {
	
	 EntityManager entity;          // creating  Entitymanager object to access to database
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("postgres");
	
	public PizzaDaoImpl() {
		entity=factory.createEntityManager();
	}
	
	public Pizza findPizzaByno(int pizzaNo) {
		Pizza p = entity.find(Pizza.class, pizzaNo);
		return p;
	}

	
	@Override
	public void addPizza(Pizza p) {
	
		entity.persist(p);
		
	}

	@Override
	public void updatePizza(Pizza p) {
	entity.merge(p);
	}

	@Override
	public void deletePizza(Pizza p) {
		entity.remove(p);
		
	}

	@Override
	public void commitTransaction() {
		entity.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		
	}
}
