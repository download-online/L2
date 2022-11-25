package attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
	public DoubleTeam() {
		super(Type.NORMAL, 0, 100);

	}
	
	protected void applySelfEffects(Pokemon target) {
		target.setMod(Stat.EVASION,1);
	}

	protected String describe() {
		return "использует Double Team";
	}
}
