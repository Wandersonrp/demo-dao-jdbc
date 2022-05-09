package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class TesteProgram {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Cars");
		
		Date birthDate = sdf.parse("22/10/1980");
		
		Seller seller = new Seller(03, "Alex", "alex@gmail.com", birthDate, 2850.53, obj);
		
		System.out.println(seller);
	}
}
