package Q_5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("==========================");
		System.out.println("=========고양이 카페========");
		System.out.println("==========================");

		Scanner sc = new Scanner(System.in);
		String cmd;
		loop_a: while (true) {
			System.out.println("명령:[1.음료/2.디저트]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("1번");
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
				System.out.println("2번명령");
				break;
			case "x":
				break loop_a;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}

		}
		System.out.println("프로그램 종료");
	}
}