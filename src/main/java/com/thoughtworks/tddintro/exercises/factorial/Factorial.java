package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {

        if (i == 0) {
            return 1;
        }
        else if (i < 0) {
            throw new IllegalArgumentException();
        }
        else {

            int factorial = i;

            for (int j = 1; j < i; j++) {
                int n = i - j;
                factorial *= n;
            }

            return factorial;
        }
    }
}
