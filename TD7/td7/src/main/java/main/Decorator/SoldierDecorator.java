package main.Decorator;

import main.Soldier;

public abstract class SoldierDecorator implements Soldier{
    protected Soldier soldat;

    public SoldierDecorator(Soldier s) {
        super();
        this.soldat = s;
    }

    @Override
    public boolean isAlive() {
        return soldat.isAlive();
    }

    @Override
    public float strike() {
        return (soldat.strike());
    }


    @Override
    public float parry(float f) {
        return soldat.parry(f);
    }

}
