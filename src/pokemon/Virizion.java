package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;
public final class Virizion extends Pokemon{
    public Virizion(String name,int level){
        super(name,level);
        setType(Type.GRASS,Type.FIGHTING);
        setStats(91,90,72,90,129,108);
        this.addMove(new Facade());
        this.addMove(new AerialAce());
        this.addMove(new CalmMind());
        this.addMove(new Confide());
    }
}
