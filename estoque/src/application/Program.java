package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		product.setName("TV LG");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1200);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.println("Enter the number os products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		System.out.println();
		System.out.println("Enter the number os products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		sc.close();

	}

}
