package attacks;

import ru.ifmo.se.pokemon.*;

public class HammerArm extends PhysicalMove {
	public HammerArm() {
		super(Type.FIGHTING, 100, 90);
	}

	protected void applySelfEffects(Pokemon target) {
		target.setMod(Stat.SPEED,-1);
	}

	protected String describe() {
		return "использует Hammer Arm";
	}
}
