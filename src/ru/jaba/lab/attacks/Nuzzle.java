package attacks;

import ru.ifmo.se.pokemon.*;

public class Nuzzle extends PhysicalMove {
	public Nuzzle() {
		super(Type.ELECTRIC, 20, 100);
	}

	protected void applyOppEffects(Pokemon target) {
		Effect effect = new Effect().condition(Status.PARALYZE);
		target.addEffect(effect);
	}

	protected String describe() {
		return "использует Nuzzle";
	}
}
