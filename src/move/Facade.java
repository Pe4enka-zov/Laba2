package move;


import pokemon.*;
import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 1.0);

    }
    @Override protected double calcBaseDamage(Pokemon att, Pokemon def){
        double damage = super.calcBaseDamage(att,def);
        Status cond = def.getCondition();
        if(cond == Status.BURN||cond == Status.POISON|| cond== Status.PARALYZE){
            return damage * 2;
        }
        return damage;
    }
    @Override public String describe() {
        return "применяет физическую аттаку атаку";
    }
}

