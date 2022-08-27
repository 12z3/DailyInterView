package DailyInterView;

import java.util.ArrayList;
import java.util.List;

public class FacebookTask {
    /**
     * @Problem: This problem was recently asked by Facebook:
     * Given a list of numbers,
     * where every number shows up twice except for one number, find that one number.
     * Input: [4, 3, 2, 4, 1, 3, 2]
     * Output: 1
     */
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(2, 3, 2, 4, 1, 3, 4, 5));
        facebookTask(input);
    }

    private static void facebookTask(List<Integer> input) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            int count = 1;
            for (int j = 0; j < input.size(); j++) {
                if (i != j) if (input.get(i) == input.get(j)) count++;
            }
            if (count == 1) result.add(input.get(i));
        }
        for (int el : result) System.out.printf("%d ", el);
    }
}
