package DailyInterView;

import java.util.Scanner;

public class TwitterTask2 {
    /**
     * @Problem: Find the k-th largest number in a sequence of unsorted numbers.
     * ([8, 7, 2, 3, 4, 1, 5, 6, 9, 0], 3))
     * result:  7
     */

    private static void findKthLargest(int[] input, int n) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, count = 0, result = 0;
        StringBuilder stb = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
                input[i] = 0;
                count++;
            }
            if (count == n - 1) {
                break;
            }
        }
        max = Integer.MIN_VALUE;
        for (int el : input) {
            if (el > max) {
                max = el;
                result = max;
            }
        }

        System.out.printf("%d ", result);
    }

    public static void main(String[] args) {
        int[] input = {8, 7, 2, 3, 4, 1, 5, 6, 9, 0};
        findKthLargest(input, 3);

    }
}
