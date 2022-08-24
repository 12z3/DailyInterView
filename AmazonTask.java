package DailyInterView;

public class AmazonTask {
    /**
     * @Problem: Hi, here's your problem today. This problem was recently asked by Amazon:
     * <p>
     * You are given an array of integers.
     * Return an array of the same size where the element at each index
     * is the product of all the elements in the original array except for the element at that index.
     * <p>
     * For example, an input of [1, 2, 3, 4, 5] should return [120, 60, 40, 30, 24].
     */

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5};
        productOfAllTheElements(input);

    }
    private static void productOfAllTheElements(int[] input) {
        int result;
        int[] resultArr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result = 1;
            for (int j = 0; j < input.length; j++) {
                if (i != j) {
                    result *= input[j];
                }
            }
            resultArr[i] = result;
        }
        for (int el : resultArr) System.out.print(el + " ");
    }
}
