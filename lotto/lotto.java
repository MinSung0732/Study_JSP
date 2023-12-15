package lotto;

public class lotto {

	public void lotto() {

		int p[] = { 1, 2, 3, 4, 5, 6 };
		int random[] = new int[6];

		random[0] = (int) (Math.random() * 45 + 1);

		while (true) {
			random[1] = (int) (Math.random() * 45 + 1);
			if (random[0] != random[1]) {
				break;
			}
		}
		while (true) {
			random[2] = (int) (Math.random() * 45 + 1);
			if (random[0] != random[2] && random[1] != random[2]) {
				break;
			}
		}
		while (true) {
			random[3] = (int) (Math.random() * 45 + 1);
			if (random[0] != random[3] && random[1] != random[3] && random[2] != random[3]) {
				break;
			}
		}
		while (true) {
			random[4] = (int) (Math.random() * 45 + 1);
			if (random[0] != random[4] && random[1] != random[4] && random[2] != random[4] && random[3] != random[4]) {
				break;
			}
		}
		while (true) {
			random[5] = (int) (Math.random() * 45 + 1);
			if (random[0] != random[5] && random[1] != random[5] && random[2] != random[5] && random[3] != random[5]
					&& random[4] != random[5]) {
				break;
			}
		}
		System.out.println("=== 당첨 번호 ===");
		System.out.println(random[0]+" ");
		System.out.println(random[1]+" ");
		System.out.println(random[2]+" ");
		System.out.println(random[3]+" ");
		System.out.println(random[4]+" ");
		System.out.println(random[5]+" ");
		
		int win = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(p[i] == random[j]) {
					win=win+1;
				}
			}
		}
		
		System.out.println("맞춘갯수: "+win);

	}
}
