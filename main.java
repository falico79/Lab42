public class main {
    public static void main(String[] args) { 
    	Product product = new Product("Edam", 3.3, 120);
    	System.out.println("Product value is " + product.countValue());
    	product.printProduct();

		
		product.changePrice(4.1);
		System.out.println("\nNew product value is " + product.countValue());
    	product.printProduct();

		product.changeBalance(100);
		System.out.println("\nNew product value is " + product.countValue());
		product.printProduct();
     }
}

class Product {
	private String name;
	private double price;
	private int amount; //Amount in storage
	public Product(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	public double countValue() {
		return(amount * price);
	}
	
	public void printProduct() {
		System.out.printf("Product %s, price %4.1f and balance %d pcs", name,price,amount);
	}
	
	public void changePrice(double newPrice) {
		this.price = newPrice;
	}

	public void changeBalance(int newvalue) {
		amount = newvalue;
	}
}
