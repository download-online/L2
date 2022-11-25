package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class DarmanitanStandard extends Darumaka {
	public DarmanitanStandard(String name, int level) {
		super(name, level);
		setStats(105,140,55,30,55,95);
		setType(Type.FIRE);
		addMove(new Bulldoze());
	}
}
