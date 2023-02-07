package td6;

import td6.Algorithmes.Algorithm;
import td6.Algorithmes.Fibonacci;
import td6.factory.SeriesBuffered;
import td6.factory.SeriesFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Class c;
        try {
            c = Class.forName(args[0]);

            SeriesFactory factory =  (SeriesFactory) c.getDeclaredConstructor().newInstance();

            Algorithm padovan = factory.createPadovan();
            Algorithm fibonacci = factory.createFibonacci();

            System.out.println(fibonacci.getVal(5));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
