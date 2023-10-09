package org.tnsif.codingchallenges;
import java.util.*;

public class ProductsExecutor {

	public static void main(String[] args) {
		
		Products products = new Products();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the product:");
                    String product = scanner.next();
                    products.addProductToList(product);
                    break;
                case 2:
                    ArrayList<String> productList = products.getProductList();
                    if (productList.isEmpty()) {
                        System.out.println("The list is empty");
                    } 
                    else {
                        products.sortProductsList();
                        System.out.println("Products:");
                        for (String p : productList) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1, 2, or 3).");
            }
        }
	}
}
