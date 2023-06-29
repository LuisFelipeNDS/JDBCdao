package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		Departament d = new Departament(1, "book");
		
		Seller s = new Seller(1, "Luis", "Luis@.com", new Date(), 1500.00, d);
		
		System.out.println(s);
	}

}
