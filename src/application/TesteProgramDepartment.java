package application;

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
	}
}
