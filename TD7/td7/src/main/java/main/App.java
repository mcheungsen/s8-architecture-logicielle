package main;

import main.Decorator.Shield;
import main.Decorator.Sword;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Soldier horseman = new Horseman(100);
        horseman = new Shield(horseman);

        Soldier fantassin = new Infantryman(80);
        fantassin = new Sword(new Shield(fantassin));


        fight(horseman, fantassin);
    }

    static void fight(Soldier s1, Soldier s2) {
        Soldier attack = s1;
        Soldier defend = s2;
        while(s1.isAlive() && s2.isAlive()) {
                defend.parry(attack.strike());
                Soldier tmpSwap = attack;
                attack = defend;
                defend = tmpSwap;
        }
        if (s1.isAlive()) 
                System.out.println("Soldier 1  Won");
        else
                System.out.println("Soldier 2  Won");
        }

}
