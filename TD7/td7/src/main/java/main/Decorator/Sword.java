package main.Decorator;

import main.Soldier;

public class Sword extends SoldierDecorator{

    public Sword(Soldier s) {
        super(s);
    }

    @Override
    public float strike() {
        return (super.soldat.strike() * 5);
    }


    @Override
    public float parry(float f) {
        return super.soldat.parry(f);
    }
}
