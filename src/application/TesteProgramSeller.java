package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class TesteProgramSeller {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		list.forEach(obj -> System.out.println(obj));
		
		System.out.println("\n=== Test 3: seller findAll ===");
		list = sellerDao.findAll();
		list.forEach(obj -> System.out.println(obj));
		
		System.out.println("\n=== Test 4: seller insert ===");
		Seller newSeller = new Seller(null, "Bryan", "bryan@gmail.com",
				new Date(), 5600.45, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== Test 5: seller update ===");
		newSeller = sellerDao.findById(8);
		newSeller.setName("Bryan Blue");
		newSeller.setEmail("bryanblue@gmail.com");
		sellerDao.update(newSeller);
		System.out.println("Update Complete!");
		
		System.out.println("\n=== Test 6: seller delete ===");
		sellerDao.deleteById(70);
		System.out.println("Delete complete!");
	}
}
