package main.Decorator;

import main.Soldier;

public class Shield extends SoldierDecorator{

    public Shield(Soldier s) {
        super(s);
    }
    
    @Override
    public float parry(float f) {
        return soldat.parry(f/2);
    }
}
