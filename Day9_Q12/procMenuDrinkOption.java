package Day9_Q12;

public class procMenuDrinkOption {
	
	public static void run( ) {
		loop:while(true) {
			System.out.println("[1.hot/2.cold/x.이전메뉴]");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				System.out.println("hot 메뉴 선택됨. 이전 메뉴 이동");
				KioskObj.basket.add(new Order(KioskObj.indexs.get(0),1));
				break loop;
			case "2":
				System.out.println("ice 메뉴 선택됨. 이전 메뉴 이동");
				KioskObj.basket.add(new Order(KioskObj.indexs.get(0),2));
				break loop;
			case "x":
				System.out.println("이전 메뉴 이동");
				break loop;
			}
		}
	}

}
