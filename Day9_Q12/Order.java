package Day9_Q12;

public class Order {
	public index selectedindex;
	public int optionHotCold = 0;
	
	public Order(index selectedindex) {
		this.selectedindex = selectedindex;
	}
	
	public Order(index selectedindex, int optionHotCold) {
		this.selectedindex = selectedindex;
		this.optionHotCold = optionHotCold;
	}

}
