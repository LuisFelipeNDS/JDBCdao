package model.dao;

import db.DB;
import model.dao.impl.DepartamentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSllerDao() {
		return new SellerDaoJDBC(DB.getConection());
	}
	public static DepartamentDao createDepartmentDao() {
		return new DepartamentDaoJDBC(DB.getConection());
	}

}
