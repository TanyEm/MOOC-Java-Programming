package validating;

public class Calculator {

    public int factorial(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("Parameter must be 0 or greater");
        }
        
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        
        if (setSize < 0) {
            throw new IllegalArgumentException("Parameter setSize must be 0 or greater");
        } else if (subsetSize > setSize) {
            throw new IllegalArgumentException("Subset size mustn't be not exceed the set size");
        }
        
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
