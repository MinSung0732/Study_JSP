package Q_1;

import java.util.Scanner;

public class Q1 {
	void run() {
		Scanner sc = new Scanner(System.in); // 스캐너 sc 를 새로만들고 적은값을 sc 에 대입한다.
		int r = 0; // r 의 값은 0이다.
		String cmd = ""; // cmd 변수를 문자열로 지정한다.
		String result = ""; // result 변수를 문자열로 지정한다.

		xx: while (true) {
			System.out.println("가위바위보 ");
			cmd = sc.next();
			r = (int) (Math.random() * 3 + 1);
			switch (cmd) {
			case "가위":
				switch (r) {
				case 1:
					result = "비김";
					break;
				case 2:
					result = "짐";
					break;
				case 3:
					result = "이김";
					break;
				}
				break;

			case "바위":
				switch (r) {
				case 1:
					result = "이김";
					break;
				case 2:
					result = "비김";
					break;
				case 3:
					result = "짐";
					break;
				}
				break;

			case "보":
				switch (r) {
				case 1:
					result = "짐";
					break;
				case 2:
					result = "이김";
					break;
				case 3:
					result = "비김";
					break;
				}
				break;
			case "x":
				break xx;
			}
			System.out.println(result);
		}
		System.out.println("프로그램 종료");
	}
}
