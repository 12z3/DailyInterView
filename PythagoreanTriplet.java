package DailyInterView;

import training.Methods;

public class PythagoreanTriplet extends Methods {
    public static void main(String[] args) {


        /**
         @Source: https://www.youtube.com/watch?v=18wOrbRN5co
         -> Pythagorean triplet; a, b, c -> (aˆ2 ?= bˆ2 + cˆ2); Uber.
         */

        int[] input = {3, 5, 12, 5, 13};

        pythagoreanTriplet(input);
    }

    private static void pythagoreanTriplet(int[] input) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < input.length - 1; i++) {
            int a = input[i];
            int b, c;
            for (int j = i + 1; j < input.length - 1; j++) {
                b = input[j];
                if (input[i] != input[j]) {
                    for (int k = j + 1; k < input.length; k++) {
                        c = input[k];
                        if (a * a + (b * b) == (c * c)) {
                            System.out.print("True" + " ");
                            System.out.println(a + " / " + b + " / " + c);

                        }
                    }
                }
            }
        }
    }
}
