package DailyInterView;

import training.Methods;

public class PythagoreanTriplet extends Methods {

    private static void pythagoreanTriplet(int[] input) {
        int a, b, c;
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            a = input[i];
            for (int j = i + 1; j < input.length; j++) {
                b = input[j];
                for (int k = j + 1; k < input.length; k++) {
                    c = input[k];
                    if (a * a + (b * b) == (c * c)) {
                        System.out.printf("%sˆ2 + %dˆ2 = %dˆ2\n", a, b, c);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        /**
         @Source: https://www.youtube.com/watch?v=18wOrbRN5co
         -> Pythagorean triplet; a, b, c -> (aˆ2 ?= bˆ2 + cˆ2); Uber.
         */

        int[] input = {3, 5, 12, 5, 13};
        pythagoreanTriplet(input);
    }
}
