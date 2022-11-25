package attacks;

import ru.ifmo.se.pokemon.*;

public class SeedFlare extends SpecialMove {
	public SeedFlare() {
		super(Type.GRASS, 120, 85);

	}

	protected void applyOppEffects(Pokemon target) {
		if (Math.random() <= 0.4) {
			target.setMod(Stat.SPECIAL_DEFENSE,-2);
		}
	}

	protected String describe() {
		return "использует Seed Flare";
	}
}
