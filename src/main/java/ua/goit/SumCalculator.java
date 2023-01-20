package ua.goit;

public class SumCalculator {
    private static final int ZERO_NUMBER = 0;
    public int sum(int n){
        if (n <= ZERO_NUMBER) {
            throw new IllegalArgumentException("Imput should be number > 0 !");
        }
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
