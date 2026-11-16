package move;

import pokemon.*;
import ru.ifmo.se.pokemon.*;

public final class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, 1.0);

    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    @Override
    protected String describe() {
        return "использует Aerial Ace";
    }
}