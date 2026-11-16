package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;
public final class Confide extends StatusMove {
    public Confide() {
        super(Type.PSYCHIC, 0, 0);

    }
    @Override protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK,-1);
    }
    @Override protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    @Override protected String describe() {
        return "использует Confide";
    }
}
