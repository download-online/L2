package attacks;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
	public Overheat() {
		super(Type.FIRE, 130, 90);
	}
	
	protected void applySelfEffects(Pokemon target) {
		target.setMod(Stat.SPECIAL_ATTACK,-2);
		Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK,+2).turns(0);
		target.addEffect(effect);
	}

	protected String describe() {
		return "использует Overheat";
	}
}
