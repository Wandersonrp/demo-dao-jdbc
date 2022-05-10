package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class TesteProgramDepartment {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1 : department insert ===");
		Department dep = new Department(5, "Management");
		departmentDao.insert(dep);
	}
}
