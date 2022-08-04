package DailyInterView;

public class SingleNumber {


//    suM = getSuM(number, suM);
//    four = getSuM(suM,two);
//        System.out.printf("So the answer is: %d ", four);

    private static int getSuM(int number, int suM) {
        while (number > 0) {
            int one = number % 10;
            suM += one;
            number = number / 10;
        }
        return suM;
    }

    public static void main(String[] args) {

        /*
        TODO: This problem was recently asked by Amazon:

        Given a number like 159, add the digits repeatedly until you get a single number.
        For instance, 1 + 5 + 9 = 15.
        1 + 5 = 6.

       15934 = 22 = 4
       159456545 = 44 = 8
        */

        int number = 159456545, suM = 0, four = 0;

        while (number > 0) {
            int one = number % 10;
            suM += one;
            number = number / 10;
        }
        while (suM > 0) {
            int two = suM % 10;
            four += two;
            suM = suM / 10;
        }

        System.out.printf("So the answer is: %d ", four);
    }
}
