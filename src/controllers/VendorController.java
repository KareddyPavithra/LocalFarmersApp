package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Product;
import models.Vendor;


public class VendorController {

	private List<Vendor> vendorList;
	
	public VendorController() {
		this.vendorList = new ArrayList<>();
	}
	
	public Vendor registerVendor(String fullName, String email, String password, String area,List<Product> productList) {
		
		//maybe some null value checks, let's see
		Vendor newVendor = new Vendor(fullName, email, password, area,productList);
		vendorList.add(newVendor);
		return newVendor;
	}
	
	public boolean authenticateVendor(String email, String password) {
		
		//do null checks here
		for(Vendor vendor: vendorList) {
			if(vendor.getEmail().equals(email) && vendor.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	//get single user by email
	public Vendor getVendorByEmail(String email) {
		for(Vendor vendor: vendorList) {
			if(vendor.getEmail().equals(email)) {
				return vendor;
			}
		}
		return null;
	}
	
	//get all users
	public List<Vendor> getAllVendors(){
		return vendorList;
	}
}
