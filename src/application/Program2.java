package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		IO.println("=== Test 1: Department fyndById ===");
		Department department = departmentDao.findById(3);
		IO.println(department);
		
		
		
	}

}
