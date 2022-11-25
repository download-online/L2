package attacks;

import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {
	public TailWhip() {
		super(Type.NORMAL, 0, 100);
	}
	
	protected void applyOppEffects(Pokemon target) {
		target.setMod(Stat.DEFENSE,-1);
	}

	protected String describe() {
		return "использует Tail Whip";
	}
}
