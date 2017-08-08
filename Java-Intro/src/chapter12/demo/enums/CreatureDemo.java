package chapter12.demo.enums;

import static chapter12.demo.enums.Creature.SNAKE;
import static chapter12.demo.enums.Creature.SPIDER;

public class CreatureDemo {

	public static void main(String[] args) {

		Creature oneCreature = SNAKE;
		Creature anotherCreature = SPIDER;

		System.out.println(oneCreature.getDescription());
		System.out.println(anotherCreature.getDescription());
	}
}
