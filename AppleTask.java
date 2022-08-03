package DailyInterView;

import java.util.Scanner;

public class AppleTask {

    private static void appleTask() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stb = new StringBuilder();
        boolean isBreak = true;

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            stb.append(input.charAt(i));
        }                                             // Може да се доодправи. Вмъкни първите два фора в while-a.
//        for (int j = 0; j < stb.length(); j++) {      // ... Редове от 26 до 40 да отпаднат
//            //isBreak = false;                        //    <- Това Ако не е закоментирано не работи като Хората
//                                               // Защото никога не влиза в while-блока тъй като isBreak = false
//            for (int i = j + 1; i < stb.length(); i++) {                    // cabba
//                if (stb.charAt(j) == stb.charAt(i) && (i == j + 1)) {       // (i == j + 1) -> Тук е Магията
//                    stb.deleteCharAt(i);
//                    stb.deleteCharAt(j);
//                } else isBreak = true;
//            }
//        }
        while (isBreak) {
            for (int j = 0; j < stb.length(); j++) {
                isBreak = false;
                for (int i = j + 1; i < stb.length(); i++) {
                    if (stb.charAt(i) == stb.charAt(j) && (i == j + 1)) {
                        stb.deleteCharAt(i);
                        stb.deleteCharAt(j);
                        isBreak = true;                              // Докато  isBreak = true -> Търси съвпадения.
                    } else isBreak = false;
                }
            }

        }
        System.out.println(stb);
    }

    public static void main(String[] args) {

        /*
        TODO: This problem was recently asked by Apple:      <--

        Given a string, we want to remove 2 adjacent characters that are the same,
        and repeat the process with the new string until we can no longer perform the operation.

        Here's an example and some starter code:

        print(remove_adjacent_dup("cabba"))
        # Start with cabba
        # After remove bb: caa
        # After remove aa: c
        # print c
        */

        // cabba -> Ok.
        // caba -> Huston We've Problem.

        appleTask();
    }
}
