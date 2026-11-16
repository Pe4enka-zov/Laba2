import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Virizion("Зеленый конь епта", 1);
        Pokemon p2 = new Swinub  ("хряка", 1);
        Pokemon p3 = new Whiscash("Сомотсосом",1);
        Pokemon p4 = new Barboach("ЯЗЬ",1);
        Pokemon p5 = new Piloswine("ЯКХУЯК",30);
        Pokemon p6 = new Mamoswine("МАМАСВИН",30);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
         }
}