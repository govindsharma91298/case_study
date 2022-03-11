package com.pizzamanagement.Ui;

import com.pizzamanagement.model.Pizza;
import com.pizzamanagement.service.PizzaService;
import com.pizzamanagement.service.PizzaServiceImpl;

public class Test {

	public static void main(String[] args) {
		PizzaService service=new PizzaServiceImpl();  //creating pizzaaservice object get access to service class
		
		Pizza p=new Pizza(100,"capsican",285,"ABcd");  //adding values in pizza class object
		
		service.addPizza(p);  // addding object to service class
		
		service.findPizzaByno(100);  // for fetching data from databse by id
		
		System.out.println(p);
		
		System.out.println("pizza No:" +p.getPizzaNo()); // printing old details 
		System.out.println("pizza Typd :"+p. getPizzaType());
		System.out.println("Pizza price :"+p.getPizzaPrice());
		System.out.println("Delivery Address :"+p.getDeliveryAdd());
		
		
		p.setPizzaNo(111);
		p.setPizzaType("garlic bread");//  setting new entries
		p.setPizzaPrice(456);
		p.setDeliveryAdd("ghsdfn");
		
		
		service.updatePizza(p);  // updating vales 
		
		System.out.println("updated PizzaNo:"+p.getPizzaNo());
		System.out.println("updated Pizza Type:"+p.getPizzaType());
		 System.out.println("updated pizza price:"+p.getPizzaPrice());   //  printing updated values
		 System.out.println("updated delivery Address:"+p.getDeliveryAdd());
			
		
		
		
		
		
		
		
		
		service.deletePizza(p);
		
		
		
		
		
		

	}

}
