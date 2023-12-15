package Day9_Q12;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskObj {
	public static ArrayList<Order> basket = new ArrayList<>(); // 주문상품
	public static ArrayList<index> indexs = new ArrayList<>(); // 상품목록
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	
	public static void productLoad() {
		indexs.add(new index("커피",1000));
		indexs.add(new index("오렌지쥬스",2000));
		indexs.add(new index("마카롱",5000));
	}
}
