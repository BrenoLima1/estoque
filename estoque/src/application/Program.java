package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many products do you want to add? ");
		int n = sc.nextInt();
		sc.nextLine();

		Product[] productsArr = new Product[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Enter product data");
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();

			Product product = new Product(name, price);
			
			productsArr[i] = product;

			System.out.println("Product data: " + product);
			System.out.print("Enter the number of products to be added in stock: ");

			int quantity = sc.nextInt();

			product.addProducts(quantity);

			System.out.println("Updated data: " + product);

			System.out.print("Enter the number of products to be removed from stock: ");

			quantity = sc.nextInt();
			sc.nextLine();

			System.out.println("Updated data: " + product);

			product.removeProducts(quantity);
			
		}
		
		for(Product product : productsArr) {
			System.out.println(product);
		}
		
		sc.close();
	}

}
