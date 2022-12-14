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
                max = input[i];                      // {8, 7, 2, 3, 4, 1, 5, 6, 9, 0}
                input[i] = 0;                        // Нулира максималното число на всяка итерация.
                count++;                             // {0, 7, 2, 3, 4, 1, 5, 6, 0, 0}
            }
            if (count == n - 1) {                    // Условието, че двете намерени максимални числа са = 0.
                break;
            }
        }
        max = Integer.MIN_VALUE;
        for (int el : input) {                        // {0, 7, 2, 3, 4, 1, 5, 6, 0, 0}
            if (el > max) {
                max = el;
                result = max;
            }
        }

        System.out.printf("%d ", result);
    }

    public static void sortIntArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    private static void otherFindKthLargest(int[] arr, int n) {
        int count = 0;

        sortIntArray(arr);
        for (int el: arr){
            count++;
            if (count == n) System.out.printf("%d ", el);
        }
    }

    public static void main(String[] args) {
        int[] input = {8, 7, 2, 3, 4, 1, 5, 6, 9, 0};
        int[] arr = {8, 7, 2, 3, 4, 1, 5, 6, 9, 0};

        findKthLargest(input, 3);
        otherFindKthLargest(arr, 3);
    }
}
