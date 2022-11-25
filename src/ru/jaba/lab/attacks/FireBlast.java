package attacks;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
	public FireBlast() {
		super(Type.FIRE, 110, 85);

	}

	protected void applyOppEffects(Pokemon target) {
		Effect effect = new Effect().chance(0.1).condition(Status.BURN);
		target.addEffect(effect);
	}

	protected String describe() {
		return "использует Fire Blast";
	}
}
