package Q_6;

public class Q6 {
	String name;
	int price;
	
	Q6(int price, String name){
		this.name = name;
		this.price = price;
	}
	Q6(String name, int price){
		this.name = name;
		this.price = price;
	}
	Q6(String name){
		this.name = name;
	}
	Q6(){
		
	}
	
	public void info() {
		System.out.println(name+" 가격:"+price+"원");
	}

}
