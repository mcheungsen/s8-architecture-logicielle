package td6.Algorithmes;

public class Padovan implements Algorithm{

    @Override
    public String getName() {
        return "Padovan";
    }

    @Override
    public double getVal(int n) {
        if (n == 0 || n == 1 || n == 2)
            return 1;
        return getVal(n-2) + getVal(n-3);
    }
    
}
