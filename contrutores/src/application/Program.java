package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Product p = new Product(); */ 

		System.out.println("Entre product data: ");
		System.out.println("Name :");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
	
		Product product = new Product(name, price); // construtor serve para que o programador n�o cri um produto sem pre�o nome eou valor e deixa em estado consistente 
		
		
		
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
