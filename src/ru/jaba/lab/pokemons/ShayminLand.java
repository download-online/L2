package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class ShayminLand extends Pokemon {
	public ShayminLand(String name, int level) {
		super(name, level);
		setStats(100,100,100,100,100,100);
		setType(Type.GRASS);
		setMove(new SeedFlare(), new SwordsDance(), new DoubleTeam(), new Confide());
	}
}
