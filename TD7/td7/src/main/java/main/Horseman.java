package main;

public class Horseman extends SoldierAbstract{

    public Horseman(int healthPoints) {
        super(healthPoints);
        //TODO Auto-generated constructor stub
    }

    @Override
    public float strike() {
        return 20.0f;
    }

    @Override
    public float parry(float f) {
        f /= 2;
        return super.parry(f);
    }
    
}
