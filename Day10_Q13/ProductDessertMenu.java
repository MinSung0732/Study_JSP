package Day10_Q13;

public class ProductDessertMenu {

	public static void run() {
		
		Cw.cw("[메뉴목록]");
		Cw.cw("[" + KioskObj.products.get(3) + "]");
		Cw.cw("[" + KioskObj.products.get(4) + "]");
		Cw.cw("[" + KioskObj.products.get(5) + "]");
		Cw.cw(" ");
		qw: while (true) {
			Cw.cw("[1."+KioskObj.products.get(3).name+" / 2."+KioskObj.products.get(4).name+" / 3."+KioskObj.products.get(5).name+" / 4.이전메뉴]");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				KioskObj.basket.add(new Order(KioskObj.products.get(3)));
				Cw.cw("상품이 담겼습니다.");
				break;
			case "2":
				KioskObj.basket.add(new Order(KioskObj.products.get(4)));
				Cw.cw("상품이 담겼습니다.");
				break;
			case "3":
				KioskObj.basket.add(new Order(KioskObj.products.get(5)));
				Cw.cw("상품이 담겼습니다.");
				break;
			case "4":
				Cw.cw("취소 되었습니다.");
				break qw;
			default:
				Cw.cw("다시 입력해주세요.");
				break;
			}
		}

	}
}