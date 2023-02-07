package td6.Algorithmes;

import java.util.HashMap;

public class Buffer implements Algorithm{
    Algorithm algorithm;
    HashMap<Integer, Double> values;

    public Buffer(Algorithm algo){
        this.algorithm = algo;
        values = new HashMap<>();
    }

    @Override
    public String getName() {
        return algorithm.getName();
    }

    @Override
    public double getVal(int n) {
        if(!values.containsKey(n))
            values.put(n, algorithm.getVal(n));
        return values.get(n);
    }

}