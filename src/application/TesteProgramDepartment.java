package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class TesteProgramDepartment {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1 : department insert ===");
		Department dep = new Department(7, "Management");
		departmentDao.insert(dep);
		
		System.out.println("\n=== Test 2 : department update ===");
		dep.setId(1);
		dep.setName("Office");
		departmentDao.update(dep);
		
		System.out.println("\n=== Test  3: department delete ===");
		departmentDao.deleteById(7);
		
		System.out.println("\n=== Test  4: department findById ===");
		dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== Test  5: department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		list.forEach(d -> System.out.println(d));
	}
}
