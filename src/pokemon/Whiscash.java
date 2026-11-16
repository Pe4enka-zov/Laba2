package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;
public final class Whiscash extends Barboach{
    public Whiscash(String name, int level){
        super(name,level);
        setStats(110,78,73,76,71,60);
        this.addMove(new Tickle());

    }
}
