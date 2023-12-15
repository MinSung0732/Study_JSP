package Day9_Q8;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("======= 고양이 카페 =======");
		System.out.println("========================");
		ArrayList<String> xx = new ArrayList<String>();
		index p1 = new index("아아", 1000);
		index p2 = new index("뜨아", 2000);
		index p3 = new index(5000, "마카롱");
		int totalPrice = 0;

		Scanner sc = new Scanner(System.in);
		String cmd = "";

		ff: while (true) {
			System.out.println("[ =메뉴를 골라주십시요= ]");
			System.out.println("[ 1. 음료 / 2. 디저트 ]");
			System.out.println("[ 주문 확정 : o ]");
			System.out.println("[ = 키오스크 종료 : x =]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("[ ====== 음료 리스트 ====== ]");
				p1.info();
				p2.info();

				f2: while (true) {
					System.out.println("[1.아아 / 2.뜨아 / x.뒤로가기]");
					cmd = sc.next();
					switch (cmd) {
					case "1":
						xx.add(p1.name);
						System.out.println(p1.name+" 를 선택하셨습니다.");
						totalPrice = totalPrice + p1.price;
						break;
					case "2":
						xx.add(p2.name);
						System.out.println(p2.name+" 를 선택하셨습니다.");
						totalPrice = totalPrice + p2.price;
						break;
					case "x":
						System.out.println("감사합니다.");
						break f2;
					default:
						System.out.println("다시 선택해주세요.");
						break;
					}
				}
				break;
			case "2":
				System.out.println("[ =====디저트 리스트===== ]");
				p3.info();
				f3: while(true) {
					System.out.println("[1.마카롱 / x.뒤로가기]");
					cmd = sc.next();
					switch(cmd) {
					case "1":
						xx.add(p3.name);
						System.out.println(p3.name+" 를 선택하셨습니다.");
						totalPrice = totalPrice + p3.price;
						break;
					case "x":
						System.out.println("감사합니다.");
						break f3;
					default:
						System.out.println("다시 선택해주세요.");
						break;
					}
				}
				break;
			case "o":
				if(xx.size() > 0 ) {
					System.out.println("총 주문메뉴는 "+xx.size());
					for(int i=0;i<xx.size();i=i+1) {
						System.out.println(xx.get(i));
					}
					System.out.println("총 가격은: "+totalPrice);
					break ff;
				}else if(0 >= xx.size()){
					System.out.println("메뉴가 없습니다.");
					break;
				}
			case "x":
				System.out.println("감사합니다. 또 들려주세요.");
				break ff;
			default:
				System.out.println("다시 선택해주세요.");
				break;

			}
		}

	}

}
