package org.tnsif.codingchallenges;
import java.util.*;

public class Products {

	private ArrayList<String> productsList = new ArrayList<>();
	
	public ArrayList<String> getProductList() {
		return productsList;
	}

	public void setProductsList(ArrayList<String> productsList) {
		this.productsList = productsList;
	}
	
	public void addProductToList(String product) {
		productsList.add(product);
	}
	
	public void sortProductsList() {
		Collections.sort(productsList);
	}
}

