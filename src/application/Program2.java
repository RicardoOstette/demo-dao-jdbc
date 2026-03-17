package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		IO.println("=== Test 1: Department fyndById ===");
		Department dep = departmentDao.findById(3);
		IO.println(dep);
		
		IO.println();
		
		IO.println("=== Test 2: Department fyndAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			IO.println(obj);
		}
		
		IO.println();
		
		IO.println("=== Test 3: Department insert ===");
		Department newDepartment = new Department(null, "Remedy");
		departmentDao.insert(newDepartment);
		IO.println("Inserted! New Department:" + newDepartment.getName());
		
		IO.println();
		
		IO.println("=== Test 4: Department update ===");
		dep = departmentDao.findById(6);
		dep.setName("Furnishings");
		departmentDao.update(dep);
		IO.println("Update Complete");
		
		IO.println();
		
		IO.println("=== Test 5: Department delete ===");
		departmentDao.deleteById(8);
		IO.print("Enter id for delete test: ");
		int idDepartment = sc.nextInt();
		departmentDao.deleteById(idDepartment);
		IO.println("Delete Complete");
		
		
		sc.close();
	}

}
