package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre product data: ");
		System.out.println("Name :");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product2 product = new Product2(name, price); 
		
		product.setName ("Computador");
		System.out.println("Update name: "+ product.getName());
		product.setPrice(1200);
		System.out.println("update price: " + product.getPrice());

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Entre the number of products to be added in  stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();

		sc.close();

	}

}
