package Day10_Q13;

public class Order {
	public Product selectedproduct;
	public int optionHotCold = 0;
	public String option;
	
	public Order(Product selectedproduct) {
		this.selectedproduct = selectedproduct;
	}

	public Order(Product selectedproduct, int optionHotCold,String option) {
		this.selectedproduct = selectedproduct;
		this.optionHotCold = optionHotCold;
		this.option = option;
	}
}
