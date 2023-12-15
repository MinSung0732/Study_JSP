package Day9_Q12;

public class procMenuDessert {
	public static void run() {
		
			System.out.println(KioskObj.indexs.get(2).name + " " + KioskObj.indexs.get(2).price);
		yy:while(true) {
			System.out.println("[1.마카롱/x.이전메뉴로]");
			KioskObj.cmd=KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				System.out.println(KioskObj.indexs.get(2).name+" 선택됨");
				KioskObj.basket.add(new Order(KioskObj.indexs.get(2)));
				break;
			case "x":
				System.out.println("이전 메뉴 이동");
				break yy;
			}
		}
	}

}
