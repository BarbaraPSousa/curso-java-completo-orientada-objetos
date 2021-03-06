package entities;

public class Product {
	
	public String nome;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;		
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	public void removeProdut(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return nome
				+ ", $ "
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity
				+ "units, total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}


