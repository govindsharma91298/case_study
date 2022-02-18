package caseStudy3;

import java.util.*;


public class EndUser extends Product{

	public void AddProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Product id");
		int n = sc.nextInt();
		sc.nextLine();
		setProductid(n);
		System.out.println("Enter Name of product");
		String name = sc.nextLine();
		setName(name);
		System.out.println("Enter the amount");
		int amount = sc.nextInt();
		
		setAmount(amount);
		System.out.println("Enter the code for product");
		int code = sc.nextInt();
		sc.nextLine();
		setCode(code);
		System.out.println("Enter address");
		String address = sc.next();
		setAddress(address);
		
		System.out.println("Enter Pincode");
		int pincode = sc.nextInt();
		setPincode(pincode);
		
	}
	public void Update(EndUser l) {
		l.AddProduct();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product id"+getProductid()+"Product Name "+getName()+"\n"+"Price "+getAmount()+"\n"+"Product Code "+getCode()+"\n"+"Address "+getAddress()+"\n"+"Pincode "+getPincode()+"\n";
	}
	public static void main(String[] args) {
		HashMap<Integer,Product> h1=new HashMap<Integer,Product>();
		
		int choice=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			
		System.out.println("Enter a choice: ");
		System.out.println("1. AddProduct\n2. updateProduct \n3. deleteProduct \n4. getProduct \n5. getAllProducts ");
		choice =sc.nextInt();
		
		switch(choice) {
		case 1:
			
			EndUser p1=new EndUser(); 
			p1.AddProduct();
			h1.put(p1.getProductid(), p1);
			System.out.println("Product added successfully");
		
			
			break;
			
		case 2:
			System.out.println("Enter Product id");
			int n = sc.nextInt();
			
			 h1.get(n).Update();
			System.out.println("Product Updated Successfully \n");
			break;
		case 3:
			System.out.println("Enter a Product id");
			int m = sc.nextInt();
			h1.remove(m);
			break;
		case 4:
			System.out.println("Enter a Product id");
			int o = sc.nextInt();
			System.out.println(h1.get(o));
			
			break;
		case 5: 
			Set<Integer> s = h1.keySet();
			for(Object c:s) {
				System.out.println(h1.get(c));
			}
			break;
			
		default:
			System.out.println("Enter a valid choice!!!");
			
			
		}
		
		
	}

}

	}

