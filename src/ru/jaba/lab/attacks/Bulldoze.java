package attacks;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
	public Bulldoze() {
		super(Type.GROUND, 60, 100);
	}

	protected void applyOppEffects(Pokemon target) {
		target.setMod(Stat.SPEED, -1);
	}

	protected String describe() {
		return "использует Bulldoze";
	}
}
