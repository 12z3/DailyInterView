package DailyInterView;

public class MicrosoftTask {
    private static void resolvedProblem(int[] input) {
        int[] array = new int[input.length];
        int a, b, c, result, tmp;

        for (int i = 0; i < input.length; i++) array[i] = Math.abs(input[i]);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }

        for (int el : array) System.out.print(el + " ");

        a = array[0];
        b = array[1];
        c = array[2];

        result = a * b * c;
        System.out.printf("\nResult = %d * %d * %d = %d", a, b, c, result);
    }

    public static void main(String[] args) {

        /** @Problem: Hi, here's your problem today. This problem was recently asked by Microsoft:
        You are given an array of integers.
        Return the largest product that can be made by multiplying any 3 integers in the array.
        Example:
        [-4, -4, 2, 8] should return 128 as the largest product can be made by multiplying -4 * -4 * 8 = 128.*/

        int[] input = {-4, -4, 2, 8};
        resolvedProblem(input);
    }
}
