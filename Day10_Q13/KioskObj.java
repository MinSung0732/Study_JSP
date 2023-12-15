package Day10_Q13;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskObj {
	public static ArrayList<Order> basket = new ArrayList<>();
	public static ArrayList<Product> products = new ArrayList<>();
	public static String cmd;
	public static Scanner sc = new Scanner(System.in);
	
	public static void productLoad() {
		products.add(new Product("커피",1500));
		products.add(new Product("스무디",3000));
		products.add(new Product("에이드",2500));
		products.add(new Product("쿠키",1000));
		products.add(new Product("마카롱",2000));
		products.add(new Product("케이크",4000));
		
	}
}
