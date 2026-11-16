package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;
public class Barboach extends Pokemon{
    public Barboach(String name,int level){
        super(name,level);
        setType(Type.WATER,Type.GROUND);
        setStats(91,90,72,90,129,108);
        this.addMove(new Scald() );
        this.addMove(new Bulldoze());
        this.addMove(new RockTomb());

    }
}
