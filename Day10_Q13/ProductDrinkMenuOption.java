package Day10_Q13;


public class ProductDrinkMenuOption {
	
	public static void run() {
		
		qq:while(true) {
			Cw.cw("[옵션선택: 1.Hot / 2.Cold / 3.취소]");
			KioskObj.cmd = KioskObj.sc.next();
			switch (KioskObj.cmd) {
			case "1":
				KioskObj.basket.add(new Order(KioskObj.products.get(0),1,"Hot"));
				Cw.cw("상품이 담겼습니다.");
				break qq;
			case "2":
				KioskObj.basket.add(new Order(KioskObj.products.get(0),2,"Cold"));
				Cw.cw("상품이 담겼습니다.");
				break qq;
			case "3":
				Cw.cw("취소 되었습니다.");
				break qq;
			default:
				Cw.cw("다시 입력해주세요.");
				break;
			}
		}
	}

}
