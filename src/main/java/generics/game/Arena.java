package generics.game;

//Am facut clasa generica cu <Thing>
//Daca limitam clasa la Thing extends Entity => se numeste Bounded Generic
public class Arena<Thing extends Entity, OtherThing> {
//	cream o clasa pentru o arena cu un player
	private Thing thing;
	private OtherThing otherThing;

	public Arena(Thing thing, OtherThing otherThing) {
		System.out.println("2 things appear in the arena...");
		this.thing = thing;
		this.otherThing = otherThing;
	}

	public Thing getThing() {
		return thing;
	}

	public OtherThing getOtherThing() {
		return otherThing;
	}

	public void fight() {
		System.out.println(((Player) thing).getName()
				+ " fights the " + ((Enemy) otherThing).getName());
	}
}
