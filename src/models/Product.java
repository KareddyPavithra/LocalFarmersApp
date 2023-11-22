package models;

public class Product {
	
    private String name;
    private int quantity;
    private double price;
    private String type;
    private Vendor vendor;

    public Product(String name, int quantity, double price, String type, Vendor vendor) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vendor getvendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
  
    @Override
    public String toString() {
        return "Product [name=" + name + ", quantity=" + quantity + ", price=" + price + ", type=" + type + ", vendor="
                + vendor + "]";
    }

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
