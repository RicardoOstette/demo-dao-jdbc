package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		IO.println("=== Test 1: seller fyndById ===");
		Seller seller = sellerDao.findById(3);
		IO.println(seller);
		
		IO.println();
		
		IO.println("=== Test 2: seller fyndByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
		for (Seller obj : list) {
			IO.println(obj);
		}
		
		IO.println();
		
		IO.println("=== Test 3: seller fyndAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			IO.println(obj);
		}
		
		IO.println();
		
		IO.println("=== Test 4: seller insert ===");
		Seller newseller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, new Department(2, null));
		sellerDao.insert(newseller);
		IO.println("Inserted! New id = " + newseller.getId());
	}

}
