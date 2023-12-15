package Q_2;

public class Q2 {
	String name;
	int hp;
	int attack;
	String race;
	
	Q2(String name, int hp, int attack, String race){
		
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.race= race;
		System.out.println(this.name+"이(가) 태어남");
	}
	
	void info() {
		System.out.println("이름:"+this.name+"["+this.hp+"]"
				+" 공격력:"+this.attack);
	}

}
