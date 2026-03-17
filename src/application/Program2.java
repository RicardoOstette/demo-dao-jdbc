package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		IO.println("=== Test 1: Department fyndById ===");
		Department department = departmentDao.findById(3);
		IO.println(department);
		
		IO.println();
		
		IO.println("=== Test 2: Department fyndAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			IO.println(dep);
		}
		
		IO.println();
		
		IO.println("=== Test 3: Department insert ===");
		Department newDepartment = new Department(null, "remedy");
		departmentDao.insert(newDepartment);
		IO.println("Inserted! New Department:" + newDepartment.getName());
		
		
	}

}
