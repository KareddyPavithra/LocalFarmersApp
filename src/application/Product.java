package application;
import java.util.List;

public class Product {
	
    private String category;
    private int vendor;
    private String name;
    private double price;
    private int count;
    private String image;

    public Product(String category, int vendor, String name, double price, int count, String image) {
        this.category = category;
        this.vendor = vendor;
        this.name = name;
        this.price = price;
        this.count = count;
        this.image = image;
    }

	
	public String getCategory() {
		return this.category;
	}
	
	public int getvendor() {
		return this.vendor;
	}
	
	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void setCount(int cnt) {
		this.count = cnt;
	}
	
	public String getImage() {
		return this.image;
	}
	
	public static Product valueOf() {
		return null;
	}
	
	public Product getObject() {
		Product obj = new Product(this.category, this.vendor, this.name, this.price, this.count, this.image);
		return obj;
	}
}
