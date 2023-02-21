package main;

public class Infantryman extends SoldierAbstract{

    public Infantryman(int healthPoints) {
        super(healthPoints);
    }

    @Override
    public float strike() {
            return 10.0f;
        }


    
}
