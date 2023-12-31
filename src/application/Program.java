package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSllerDao();
		System.out.println("--- TESTE BY ID ---");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n--- TESTE BY DEPARTAMENT ---");
		Departament departament = new Departament(2, null);
		List<Seller> list = sellerDao.findByDepartament(departament);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n--- TESTE FIND ALL ---");
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n--- TESTE INSERT ---");
		Seller newSeller = new Seller(null, "Luis", "Luis@.com",
				new Date(), 40.0, departament );
		sellerDao.insert(newSeller);
		
		System.out.println("Inserido, novo ID = " + newSeller.getId());
		
		System.out.println("\n---TESTE UPDATE---");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n---TESTE DELETE---");
		System.out.println("Enter id for delete test: ");
		int id = teclado.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		
		
		
	}

}
