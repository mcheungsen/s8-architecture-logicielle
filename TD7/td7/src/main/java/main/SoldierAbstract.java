package main;

public abstract class SoldierAbstract implements Soldier{
    private float healthPoints;

    public SoldierAbstract(float healthPoints){
        this.healthPoints = healthPoints;
    }

    @Override
    public boolean isAlive(){
        return healthPoints > 0;
    }

    @Override
    public float parry(float f){
        if(f > healthPoints){
            float tmp = f - healthPoints;
            healthPoints = 0;
            return tmp;
        }
        healthPoints -= f;
        return 0f;
    }


    // Getters 

    public float getHealthPoints(){
        return healthPoints;
    }

}
