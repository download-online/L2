package attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
	public Rest() {
		super(Type.PSYCHIC, 0, 100);
	}
	
	protected void applySelfEffects(Pokemon target) {
		target.restore();
		Effect effect = new Effect().condition(Status.SLEEP).turns(2);
		target.addEffect(effect);
	}

	protected String describe() {
		return "использует Rest";
	}
}
