package services;

import java.util.List;

import controllers.VendorController;
import models.Product;
import models.Vendor;

public class VendorService {
	
	private VendorController vendorController;
	
	public VendorService(VendorController vendorController) {
		this.vendorController = vendorController;
	}
	
	public Vendor registerVendor(String fullName, String email, String password, String area,List<Product> productList) {
		//do some null checks 
		if(isEmailUnique(email)) {
			return vendorController.registerVendor(fullName, email, password, area,productList);
		}
		else {
			//maybe try exception instead of this
			System.out.println("Registration failed: Email already in use");
			return null;
		}
	}
	
	private boolean isEmailUnique(String email) {
		for(Vendor vendor: vendorController.getAllVendors()) {
			if(vendor.getEmail().equals(email)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean authenticateVendor(String email, String password) {
		return vendorController.authenticateVendor(email, password);
	}

	public Vendor getUserByEmail(String email) {
		return vendorController.getVendorByEmail(email);
	}
	
	public List<Vendor> getAllVendors(){
		return vendorController.getAllVendors();
	}
	
}
