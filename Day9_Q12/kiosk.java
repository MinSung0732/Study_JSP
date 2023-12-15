package Day9_Q12;

public class kiosk{
	
	void run() {
		KioskObj.productLoad();
		for(index p:KioskObj.indexs) {
			System.out.println(p.name+" "+p.price+"원");
		}
		xx:while(true) {
			System.out.println("명령 입력[1.음료선택/2.디저트선택/e.프로그램종료]");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				procMenuDrink.run();
				break;
			case "2":
				procMenuDessert.run();
				break;
			case "e":
				System.out.println("장바구니에 담긴 상품갯수: "+KioskObj.basket.size());
				int sum=0;
				for(Order o:KioskObj.basket) {
					sum = sum+o.selectedindex.price;
				}
				System.out.println("계산하실 금액은 :"+sum+"원 입니다.");
				for(Order o:KioskObj.basket) {
					System.out.println(o.selectedindex.name);
				}
				System.out.println("===============");
				System.out.println("프로그램종료");
				break xx;
			}
		}
	}
	
		
}