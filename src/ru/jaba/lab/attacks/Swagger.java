package attacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
	public Swagger() {
		super(Type.NORMAL, 0, 85);
	}

	protected void applyOppEffects(Pokemon target) {
		target.setMod(Stat.ATTACK,2);
		target.confuse();
	}

	protected String describe() {
		return "использует Swagger";
	}
}
