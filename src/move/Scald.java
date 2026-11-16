package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;
public final class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.burn(p);
        }
    }

    @Override protected void applySelfEffects(Pokemon p) {
        if (p.getCondition() == Status.FREEZE) {
            p.setCondition(new Effect().condition(Status.NORMAL));
        }
    }
    @Override protected String describe() {
        return "использует Scald";
    }
}
