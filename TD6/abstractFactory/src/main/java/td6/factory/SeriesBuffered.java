package td6.factory;

import td6.Algorithmes.Algorithm;
import td6.Algorithmes.Buffer;
import td6.Algorithmes.Fibonacci;
import td6.Algorithmes.Padovan;

public class SeriesBuffered implements SeriesFactory{

    @Override
    public Algorithm createFibonacci() {
        return new Buffer(new Fibonacci());
    }

    @Override
    public Algorithm createPadovan() {
        return new Buffer(new Padovan());
    }
    
}
