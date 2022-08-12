package DailyInterView;

import training.Methods;

public class MicrosoftTask1 extends Methods {
    public static void main(String[] args) {

        /**
         @problem: You are given an array of integers.
         Return the largest product that can be made by multiplying any 3 integers in the array.
         Example:
         [-4, -4, 2, 8] should return 128 as the largest product can be made by multiplying -4 * -4 * 8 = 128.
         */

        int[] input = {-4, -4, 2, 8};
        int max = Integer.MIN_VALUE;
        StringBuilder resStb = new StringBuilder();
        int res = 0;

        for (int i : input) {                   // Ред: 22 -> изключва текущият елемент от сметката.
            for (int l = 0; l < input.length - 1; l++) {
                if (i != input[l]) res = Math.abs(i) * Math.abs(input[l] * Math.abs(input[l + 1]));
                if (res > max) {
                    max = res;
                    resStb.delete(0, resStb.length());
                    resStb.append(i).append(input[l]).append(input[l + 1]);
                }
            }
        }
        System.out.printf("%s = %d ", resStb, max);
    }
}
