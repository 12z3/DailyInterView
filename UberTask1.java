package DailyInterView;

import java.util.ArrayList;
import java.util.List;

public class UberTask1 {
    /**
     * @Problem: This problem was recently asked by Uber:
     * Given a list of numbers, find if there exists a pythagorean triplet in that list.
     * A pythagorean triplet is 3 variables a, b, c where a2 + b2 = c2
     * <p>
     * Input: [3, 5, 12, 5, 13]
     * Output: True
     * Here, 5ˆ2 + 12ˆ2 = 13ˆ2.
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(3, 5, 12, 5, 13));
        pythagorean(list);
        pythagoreanTwo(list);
    }

    private static void pythagorean(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (condition(list, i, j)) {
                    System.out.printf("%dˆ2 = %dˆ2 + %dˆ2%n",
                            list.get(i), list.get(j), list.get(j + 1));
                }
            }
        }
    }

    private static boolean condition(List<Integer> list, int i, int j) {
        if (i != j &&
                Math.pow(list.get(i), 2) ==
                        Math.pow(list.get(j), 2) + Math.pow(list.get(j + 1), 2)) {
            return true;
        }
        return false;
    }

    private static void pythagoreanTwo(List<Integer> list) {
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                int b = list.get(j);
                for (int k = 0; k < list.size(); k++) {
                    int c = list.get(k);

                    if (i != j && j != k && i != k){
                        if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
                            System.out.printf("%dˆ2 = %dˆ2 + %dˆ2", c, a, b);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }

}
