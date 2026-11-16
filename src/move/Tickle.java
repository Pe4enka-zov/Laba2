package move;
import pokemon.*;
import ru.ifmo.se.pokemon.*;

public final class Tickle extends StatusMove {
    public Tickle(){
        super(Type.NORMAL,0,1.0);

    }
    @Override protected boolean checkAccuracy(Pokemon att,Pokemon def){
        return true;
    }
    @Override protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK,-1);
        p.setMod(Stat.DEFENSE,-1);
    }
    @Override protected String describe(){
        return "Использует Tickle";
    }
}


