package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;
public final class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL,0,0);

    }
    @Override protected boolean checkAccuracy(Pokemon att,Pokemon def){
        return true;
    }
    @Override protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION,1);
    }
    @Override protected String describe(){
        return "Использует Double Team";
    }
}
