package td6.factory;

import td6.Algorithmes.Algorithm;

public interface SeriesFactory{
    public Algorithm createFibonacci();
    public Algorithm createPadovan();
}