package Q14;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Character character = new Character("할아버지",3,72);
		Sword sword = new Sword("검",5,10,3,20);
		Sword dagger = new Sword("단검",2,4,3,20);
		
		ArrayList<GameObj> gs = new ArrayList<GameObj>();
		gs.add(character);
		gs.add(sword);
		gs.add(dagger);
		ArrayList<Item> is = new ArrayList<Item>();
		is.add(sword);
		is.add(dagger);
		
		for(GameObj o:gs) {
			Cw.cw(o.name);
			Cw.cw(""+o.grade);
		}
		for(Item i:is) {
			Cw.cw(""+i.name);
			Cw.cw(""+i.weight);
			Cw.cw(""+i.life);
		}
	}

}
