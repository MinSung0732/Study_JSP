package Day10_Q13;

import java.util.Scanner;

public class Kiosk {
	
	
	
	public void run() {
		KioskObj.productLoad();
		String cmd;
		Scanner sc = new Scanner(System.in);
		int totalPrice = 0;
		
		Cw.cw("================================");
		Cw.cw("======== 카페 메뉴 바로보기 ========");
		Cw.cw("================================");
		
		
		
		xx:while(true) {
			Cw.cw("명령을 입력해주세요.");
			Cw.cw("[1.음료 / 2.디저트 / 3.계산 / 4.종료]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				ProductDrinkMenu.run();
				break;
			case "2":
				ProductDessertMenu.run();
				break;
			case "3":
				if(KioskObj.basket == null || KioskObj.basket.size() <= 0) {
					Cw.cw("상품이 담겨져있지않습니다.");
					break;
				}else {
					Cw.cw("장바구니에 담긴 상품갯수: "+KioskObj.basket.size());
					for(Order o:KioskObj.basket) {
						totalPrice = totalPrice + o.selectedproduct.price;
					}
					Cw.cw("계산하실 금액: "+totalPrice);
					Cw.cw("[주문 목록]");
					for(Order o:KioskObj.basket) {
						if(o.selectedproduct.name.equals("커피")) {
							Cw.cw("["+o.selectedproduct.name+"("+o.option+")]: "+o.selectedproduct.price+"원");
						}else {
							Cw.cw("["+o.selectedproduct.name+"]: "+o.selectedproduct.price+"원");
						}
					}
					break xx;
				}
			case "4":
				Cw.cw("감사합니다. 또 이용해주세요.");
				break xx;
			default:
				Cw.cw("다시 입력해주세요.");
				break;
			}
		}
	}
}
