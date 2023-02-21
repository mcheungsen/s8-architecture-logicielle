package main;

public interface Soldier {

    /**
     * 
     * @return soldat en vie (true) et mort (false)
     */
    public boolean isAlive();
    /**
     * Porter un coup
     * @return
     */
    public abstract float strike();

    public float parry(float f);

}
