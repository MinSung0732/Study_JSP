package Day10_Q13;

import java.util.Scanner;

public class ProductDrinkMenu {
	
	public static void run() {
		Scanner sc = new Scanner(System.in);
		String cmd;
		Cw.cw("[메뉴목록]");
		Cw.cw("["+KioskObj.products.get(0)+"]");
		Cw.cw("["+KioskObj.products.get(1)+"]");
		Cw.cw("["+KioskObj.products.get(2)+"]");
		Cw.cw("");
		
		zz:while(true) {
			Cw.cw("[1."+KioskObj.products.get(0).name+" / 2."+KioskObj.products.get(1).name+" / 3."+KioskObj.products.get(2).name+" / 4. 이전메뉴]");
			cmd = sc.next();
			switch(cmd) {
			case "1":
				ProductDrinkMenuOption.run();
				break;
			case "2":
				KioskObj.basket.add(new Order(KioskObj.products.get(1)));
				Cw.cw("상품이 담겼습니다.");
				break;
			case "3":
				KioskObj.basket.add(new Order(KioskObj.products.get(2)));
				Cw.cw("상품이 담겼습니다.");
				break;
			case "4":
				break zz;
			default:
				Cw.cw("다시 입력해주세요.");
				break;
			}
		}
	}

}
