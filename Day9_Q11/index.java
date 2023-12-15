package Day9_Q11;

public class index {
	String name;
	int price;
	
	index(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	index(int price,String name){
		this.price = price;
		this.name = name;
	}
	
	index(String name){
		this.name = name;
	}
	
	index(){
		
	}
	
	public void info() {
		System.out.println(name + " 가격"+price+" 원");
	}

}
