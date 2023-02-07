package td6.Algorithmes;

public class Fibonacci implements Algorithm{

    @Override
    public String getName() {
        return "Fibonacci";
    }

    @Override
    public double getVal(int n) {
        if(n == 0 || n == 1)
            return n;
        return getVal(n-1) + getVal(n-2);
    }
    
}
