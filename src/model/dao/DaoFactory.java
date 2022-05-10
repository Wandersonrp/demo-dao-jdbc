package model.dao;

import db.DataBaseConnection;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DataBaseConnection.getConnection());
	}
}
