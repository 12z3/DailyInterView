package DailyInterView;

import java.util.ArrayList;
import java.util.List;

public class TwitterPalindrome {
    /**
     * @Problem: Hi, here's your problem today. This problem was recently asked by Twitter:
     * Given an integer, check if that integer is a palindrome.
     * For this problem do not convert the integer to a string to check if it is a palindrome.
     */

    public static void main(String[] args) {
        java.util.List<Integer> list = new ArrayList<>(List.of(1,2,3,4,3,2,1));

        System.out.println(palindrome(list));
    }

    private static boolean palindrome(List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size()/2; i++) {
            int a = list.get(i);
            int b = list.get(list.size() - 1 - i);
            if (a == b) count++;
        }

        if (count == list.size() / 2) {
            return true;
        } else return false;
    }
}
