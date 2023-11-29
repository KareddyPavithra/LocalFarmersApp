package models;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> allProducts;

    public ProductController() {
        // Initialize the list of products
        this.allProducts = new ArrayList<>();
    }

    // Method to get all products
    public List<Product> getAllProducts() {
        return allProducts;
    }

    // Method to get products by category
    public List<Product> getProductsByCategory(String category) {
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product : allProducts) {
            if (product.getType().equalsIgnoreCase(category)) {
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }

    // Method to add a new product
    public void addProduct(Product product) {
        allProducts.add(product);
    }

    // Method to remove a product
    public void removeProduct(Product product) {
        allProducts.remove(product);
    }

}
