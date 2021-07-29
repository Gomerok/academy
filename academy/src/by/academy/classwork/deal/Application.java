package by.academy.classwork.deal;

import java.text.ParseException;

public class Application {

	public static void main(String[] args) {
		
		
		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();
		Product products[] = new Product[3];
		
		products[0] = new Phone("Apple12", 200.0, 2,"red", "Apple");
		products[1] = new Bike("Norco", 200.0,1,"Mountainbike",16);
		products[2] = new Bike("Gaint", 200.0,1,"Roadbike",17);
	
		deal.setBuyer(buyer);
		deal.setSeller(seller);
		
		deal.setProducts(products);
		
		//deal.deal();
		//System.out.println(buyer.getNumber());
		String str = "12/10/2021";
		DataValidator datar = new DataValidator();
		try {
			datar.validate(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
