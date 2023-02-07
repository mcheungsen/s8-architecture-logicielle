package td6.factory;

import td6.Algorithmes.Algorithm;
import td6.Algorithmes.Fibonacci;
import td6.Algorithmes.Padovan;

public class SeriesRecursion implements SeriesFactory{

    @Override
    public Algorithm createFibonacci() {
        return new Fibonacci();
    }

    @Override
    public Algorithm createPadovan() {
        return new Padovan();
    }
    
}
