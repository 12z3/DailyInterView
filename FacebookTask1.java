package DailyInterView;
public class FacebookTask1 {
    /**
     * @Problem: This problem was recently asked by Facebook:
     * Given a number n, find the least number of squares needed to sum up to the number.
     * <p>
     * Here's an example and some starting code:
     * print(square_sum(13))
     * # Min sum is 3ˆ2 + 2ˆ2
     * # 2
     */
    public static void main(String[] args) {
        squaresSum(13);
    }

    private static void squaresSum(int number) {
        for (int i = 1; i < 13; i++) {
            int a = (int) Math.pow(i, 2);
            int b = (int) Math.pow(i + 1, 2);
            if (a + b == number) {
                System.out.printf("%d + %d = %d%n", a, b, number);
            }
        }
    }
}
