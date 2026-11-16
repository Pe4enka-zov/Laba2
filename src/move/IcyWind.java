package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;
public final class IcyWind extends SpecialMove {
    public IcyWind(){
        super(Type.ICE,55,95);
    }

    @Override protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED,-1);
    }
    @Override protected String describe(){
        return "Использует Icy Wind";
    }
}
