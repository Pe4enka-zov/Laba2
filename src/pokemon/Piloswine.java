package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;
public class Piloswine extends Swinub {
    public Piloswine(String Name, int level){
        super(Name,level);
        setStats(100,100,80,60,60,50);
        this.addMove(new IcyWind());
    }
}
