package models;

import java.util.List;
public class Vendor {

	private String fullName;
	private String email;
	private String password;
	private String area;
	private List<Product> productList;
	
	public Vendor(String fullName, String email, String password, String area,List<Product> productList) {
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.area = area;
		this.productList=productList;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public void setProductList(List<Product> productList) {
		this.productList=productList;
	}
	
	public List<Product> getProductList(){
		return productList;
	}
	@Override
	public String toString() {
		return "User details: " + "full name: " + fullName + ", email: " + email + ", area: " + area;
	}
}
