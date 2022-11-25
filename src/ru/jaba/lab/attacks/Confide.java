package attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
	public Confide() {
		super(Type.NORMAL, 0, 100);
	}

	protected void applyOppEffects(Pokemon target) {
		target.setMod(Stat.SPECIAL_ATTACK,-1);
	}

	protected String describe() {
		return "использует Confide";
	}
}
