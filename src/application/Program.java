package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {
	
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
		
		
		
	}

}
