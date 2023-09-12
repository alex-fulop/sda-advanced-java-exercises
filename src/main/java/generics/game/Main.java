package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
//		declaram obiectele din program
		Player player = new Player(100, "the hero");
		Enemy enemy = new Enemy("huge boss");
		Tree tree = new Tree();
		Item item = new Item();
		Horse horse = new Horse();

//		le desenam pe fiecare
//		player.draw();
//		enemy.draw();
//		tree.draw();
//		item.draw();

//		createNewEntity(player);
//		createNewEntity(tree);
//		createNewEntity(item);
//		createNewEntity(enemy);

//		am creat arene specifice pentru fiecare tip de entitate
		Arena<Player, Enemy> arena = new Arena<>(player, enemy);

		arena.getThing().draw();
		arena.getOtherThing().draw();

		arena.fight();



//		Arena<Item> arenaForItem = new Arena<>(item);
//		Arena<Enemy> arenaForEnemy = new Arena<>(enemy);
//		Arena<Tree> arenaForTree = new Arena<>(tree);

//		Horse nu este entitate, nu putem crea arena pentru el
//		Arena<Horse> arenaForHorse = new Arena<>(horse);

//
//		System.out.println(arenaForPlayer.getThing().getHealthPoints());
//		arenaForPlayer.getThing().draw();
//		arenaForEnemy.getThing().draw();
//		arenaForItem.getThing().draw();
//		arenaForTree.getThing().draw();
//		arenaForHorse.getThing().ride();

 //		arena.getPlayer().draw();

	}

	public static <Thing> void createNewEntity(Thing entity) {
		((Entity) entity).draw();
	}
}
