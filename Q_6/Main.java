package Q_6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("==========================");
		System.out.println("=========고양이 카페========");
		System.out.println("==========================");
		Q6 p1 = new Q6(1000,"아아");
		Q6 p2 = new Q6("뜨아",2000);
		Q6 p3 = new Q6("마카롱",5000);

		Scanner sc = new Scanner(System.in);
		String cmd;
		loop_a: while (true) {
			System.out.println("명령:[1.음료/2.디저트]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("=========================");
				System.out.println("======== 음료 리스트 =======");
				System.out.println("=========================");
				p1.info();
				p2.info();
				loop_b:
				while(true) {
					System.out.println("명령:[1.아아/2.뜨아/x.이전메뉴]");
					cmd = sc.next();
					switch (cmd) {
					case "1":
						System.out.println("아아가 1개 선택됐습니다.");
						break;
					case "2":
						System.out.println("뜨아가 1개 선택됐습니다.");
						break;
					case "x":
						break loop_b;
					}
				}
				break;
			case "2":
				System.out.println("==========================");
				System.out.println("======== 디저트 리스트 =======");
				System.out.println("==========================");
				p3.info();
				break;
			case "x":
				break loop_a;
			}

		}
		System.out.println("프로그램 종료");
	}
}