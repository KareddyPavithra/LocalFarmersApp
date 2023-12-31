package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;


public class ReadingJson {

	
	public static List<Product> ReadingJson() throws FileNotFoundException{
		
		JSONParser jsonParser = new JSONParser();
		Object jsonObject;
		List<Product> ProdArray = new ArrayList<>();
		  try {
			  
			  jsonObject = jsonParser.parse(new FileReader("./src/application/vendors.json"));
			  JSONObject json = (JSONObject) jsonObject;
			  JSONArray vendors = (JSONArray) json.get("vendors");
			  for(int i=0; i<vendors.size(); i++) {
				  JSONObject vendor = (JSONObject) vendors.get(i);
				  Integer vendorNum = Integer.parseInt((String)vendor.get("number"));
				  String vendorCategory = (String) vendor.get("category");
				  JSONArray items = (JSONArray) vendor.get("items");
				  for(int j=0; j<items.size(); j++) {
					  JSONObject item = (JSONObject) items.get(j);
					  String itemName = (String) item.get("name");
					  Double itemPrice = Double.parseDouble((String)item.get("price"));
					  Integer itemCount = Integer.parseInt((String) item.get("count"));
					  String itemImage = (String) item.get("image");
					  Product p1 = new Product(vendorCategory, vendorNum, itemName, itemPrice, itemCount, itemImage);
					  ProdArray.add(p1);
				  }
			  }
		 } catch(FileNotFoundException e) {
			 e.printStackTrace();
		 } catch(IOException e) {
			 e.printStackTrace();
		 } catch(ParseException e) {
			 e.printStackTrace();
		 }
		  return ProdArray;
	}
	
	public static List<Product> searchStr(List<Product> lst, String stri){
		List<Product> srch = new ArrayList<>();
		for(int k=0; k<lst.size(); k++) {
			String nm = lst.get(k).getName();
			if(Search(stri, nm) == true) {
				srch.add(lst.get(k));
			}
		}
		return srch;
	}
	
	public static Boolean Search(String stri, String name) {
		final int length = stri.length();
		if(length == 0)
			return true;
		
		final char frstLo = Character.toLowerCase(stri.charAt(0));
		final char frstUp = Character.toUpperCase(stri.charAt(0));
		
		for(int i = name.length() - length; i>=0; i--) {
			final char ch = name.charAt(i);
			if(ch != frstLo && ch != frstUp)
				continue;
			
			if(name.regionMatches(true, i, stri, 0, length))
				return true;
		}
		return false;
	}
}
