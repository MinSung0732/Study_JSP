package Q_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("==========================");
		System.out.println("=========고양이 카페========");
		System.out.println("==========================");

		Scanner sc = new Scanner(System.in);
		String cmd;
		loop_a: while (true) {
			System.out.println("명령: ");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("1번명령");
				break;
			case "2":
				System.out.println("2번명령");
				break;
			case "x":
				break loop_a;
			default:
				System.out.println("다시 입력");
				break;
			}

		}
		System.out.println("프로그램 종료");
	}
}