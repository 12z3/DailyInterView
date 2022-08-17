package DailyInterView;

import training.Methods;

import java.util.ArrayList;
import java.util.List;

public class TwitterTask1 extends Methods {
    public static void main(String[] args) {

        /**
         @Sourse: Daily Interview Pro
         @Problem: Given a list of numbers and a target number,
         find all possible unique subsets of the list of numbers that sum up to the target number.
         The numbers will all be positive numbers.

         print(sum_combinations([10, 1, 2, 7, 6, 1, 5], 8))
         -> [(2, 6), (1, 1, 6), (1, 2, 5), (1, 7)]

         @Issue: Много тегава стратегия е тази....
         */

        int[] a = {10, 1, 2, 7, 6, 1, 5};
        int[] b = {1, 1, 2, 5, 6, 7, 10};

        StringBuilder stb1 = new StringBuilder();
        List<Integer> digit = new ArrayList<>();
        int k = 0, sum = 0, target = 8;

        for (int i = 0; i < a.length; i++) {
            k = 0;
            if (a[i] > target) continue;
            withOne(a, k, target, i);
            //withTwo(a, k, target, i);
            System.out.println();
        }

    }

    private static void withOne(int[] a, int k, int target, int i) {
        int sum;
        while (k < a.length) {
            sum = a[i];
            if (i != k) {
                if (a[k] < target) {
                    sum += a[k];
                    System.out.printf(" -> %d + %d = %d %n", a[i], a[k], sum);
                }
                if (sum == target) {
                    System.out.printf("%d + %d = %d %n", a[i], a[k], sum);
                }
            }
            k++;
        }
    


    }
}
