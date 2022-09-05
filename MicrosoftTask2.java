package DailyInterView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MicrosoftTask2 {
    public static void main(String[] args) {

        /**
         * @Problem: Given a list of sorted numbers (can be both negative or positive),
         * return the list of numbers squared in sorted order.
         */

        List<Integer> list = new ArrayList<>(List.of(-5, -3, -1, 0, 1, 4, 5));
        List<Integer> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            result.add((int) Math.pow(Math.abs(list.get(i)), 2));
        }
        Collections.sort(result);

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.size(); j++) {
                if (result.get(i) < result.get(j)) {
                    tmp = Collections.singletonList(result.get(i));
                }
            }
        }

        for (int el : tmp) System.out.print(el + " ");
        System.out.println();
        for (int el : result) System.out.print(el + " ");
    }
}
