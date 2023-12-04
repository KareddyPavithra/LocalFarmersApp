package application;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Cart {
	private TreeMap<Integer, TreeMap<String, CartEntry>> vendorMap;
	private TreeMap<String, CartEntry> countMap;
	private static Cart INSTANCE;

	public static Cart getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Cart();
		}
		return INSTANCE;
	}

	public Cart() {
		this.vendorMap = new TreeMap<Integer, TreeMap<String, CartEntry>>();

	}

	public void addProduct(String productName) throws FileNotFoundException {
		Product prod = fetchProduct(productName);
		Integer vendor = prod.getvendor();
		if (vendorMap.containsKey(vendor) == false) {
			countMap = new TreeMap<String, CartEntry>();
			vendorMap.put(vendor, countMap);
		}
		CartEntry entry = vendorMap.get(vendor).get(productName);
		if (entry != null) {
			entry.increaseQuantity();
		} else {
			CartEntry newEntry = new CartEntry(prod, 1);
			vendorMap.get(vendor).put(productName, newEntry);
		}
	}

	public void deleteProduct(String productName) throws FileNotFoundException {
		Product prod = fetchProduct(productName);
		Integer vendor = prod.getvendor();
		CartEntry entry = vendorMap.get(vendor).get(productName);
		if (entry != null) {
			entry.decreaseQuantity();
			if (entry.getQuantity() == 0) {
				vendorMap.get(vendor).remove(productName);
				if (vendorMap.get(vendor).isEmpty()) {
					vendorMap.remove(vendor);
				}
			}
		}
	}

	public Product fetchProduct(String productName) throws FileNotFoundException {
		Product cartProd = null;
		List<Product> availableProds = ReadingJson.ReadingJson();
		for (int i = 0; i < availableProds.size(); i++) {
			if (availableProds.get(i).getName().equals(productName)) {
				cartProd = availableProds.get(i);
			}
		}
		return cartProd;
	}

	public int getQuantity(String productName) throws FileNotFoundException {
		Product prod = fetchProduct(productName);
		Integer vendor = prod.getvendor();
		CartEntry entry = vendorMap.get(vendor).get(productName);
		if (entry != null) {
			return entry.getQuantity();
		}
		return 0;
	}

	public double calculateTotal() {
		double total = 0;
		Set<Integer> vendorKeys = vendorMap.keySet();
		List<Integer> aList = new ArrayList<Integer>();
		aList.addAll(vendorKeys);

		for (int i = 0; i < aList.size(); i++) {
			for (CartEntry c : vendorMap.get(aList.get(i)).values()) {
				total = total + (c.getProduct().getPrice() * c.getQuantity());
			}
		}
		return total;
	}

	public List<Integer> getvendors() {
		Set<Integer> vendorKeys = vendorMap.keySet();
		List<Integer> aList = new ArrayList<Integer>();
		aList.addAll(vendorKeys);
		return aList;
	}

	public List<String> getProductNames(Integer vendor) {
		Set<String> prodNameKeys = getCountMap(vendor).keySet();
		List<String> pList = new ArrayList<String>();
		pList.addAll(prodNameKeys);
		return pList;
	}

	public TreeMap<Integer, TreeMap<String, CartEntry>> getvendorMap() {
		return this.vendorMap;
	}

	public TreeMap<String, CartEntry> getCountMap(Integer vendor) {
		return this.vendorMap.get(vendor);
	}
}
