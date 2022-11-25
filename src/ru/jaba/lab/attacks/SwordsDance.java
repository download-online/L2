package attacks;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
	public SwordsDance() {
		super(Type.NORMAL, 0, 100);
	}
	
	protected void applySelfEffects(Pokemon target) {
		target.setMod(Stat.ATTACK,2);
	}

	protected String describe() {
		return "использует Swords Dance";
	}
}
