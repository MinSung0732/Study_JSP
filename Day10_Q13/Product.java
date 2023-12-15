package Day10_Q13;

public class Product {
	String name;
	int price;
	
	Product(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return name+" ["+price+"원]";
	}
}