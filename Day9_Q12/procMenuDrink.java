package Day9_Q12;

public class procMenuDrink {
	
	public static void run() {
		
		yy:while(true) {
			System.out.println(KioskObj.indexs.get(0).name + " " + KioskObj.indexs.get(0).price);
			System.out.println(KioskObj.indexs.get(1).name + " " + KioskObj.indexs.get(1).price);
			
			System.out.println("[1.커피/2.오렌지쥬스/x.이전메뉴로]");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				procMenuDrinkOption.run();
				break;
			case "2":
				System.out.println(KioskObj.indexs.get(1).name+" 선택됨");
				KioskObj.basket.add(new Order(KioskObj.indexs.get(1)));
				break;
			case "x":
				System.out.println("이전 메뉴 이동");
				break yy;
			}
		}
	}

}
