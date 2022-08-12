package DailyInterView;

import training.Methods;

public class UberTask extends Methods {

    /**
     @Problem: Hi, here's your problem today. This issue was recently asked by Uber:
     Given a list of numbers, find if there exists a pythagorean triplet in that list.
     A pythagorean triplet is 3 variables a, b, c where a2 + b2 = c2

     Example:
     Input: [3, 5, 12, 5, 13]
     Output: True
     Here, 52 + 122 = 132.
     */

    private static String pythagoreancted(int[] input) {
        StringBuilder result = new StringBuilder();
        int i = 0, res = 0, a = 0, b = 0, c = 0;

        while (i < input.length) {
            a = input[i];
            for (int l = 0; l < input.length; l++) {
                b = input[l];
                for (int m = 0; m < input.length; m++) {
                    c = input[m];
                    if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
                        res = (int) Math.pow(c, 2);
                        result.append(Math.pow(c, 2)).append(Math.pow(a, 2)).append(Math.pow(b, 2));
//                        System.out.print(
//                                "True: " + res + " = " + (int) Math.pow(a, 2) + " + " + (int) Math.pow(b, 2) + "; ");
//                        System.out.printf("%d = %d + %d \n", c, a, b);
                        return c + "ˆ2" + " = " + a + "ˆ2" + " + " + b + "ˆ2" + "; " +
                                "True: " + res + " = " + (int) Math.pow(a, 2) + " + " + (int) Math.pow(b, 2) + "; ";
                    }
                }
            }
            i++;
        }
        return "False";
    }
    public static void main(String[] args) {
        timeAndData();
        int[] input = {3, 5, 12, 5, 13};

        System.out.println(pythagoreancted(input));
    }
}
