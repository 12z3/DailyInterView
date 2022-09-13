package DailyInterView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoogleTaskMedian {
    /**
     * @Problem: Hi, here's your problem today. This problem was recently asked by Google:
     * You are given a stream of numbers. Compute the median for each new element .
     * <p>
     * Eg. Given [2, 1, 4, 7, 2, 0, 5], the algorithm should output [2, 1.5, 2, 3.0, 2, 2, 2]
     *
     * @WebResources: <a href="https://mediancalculator.com/">...</a>
     */

    public static void main(String[] args) {
        List<Integer> stream = new ArrayList<>(List.of(2, 1, 4, 7, 2, 0, 5));

        medianGoogle(stream);
    }

    private static void medianGoogle(List<Integer> stream) {
        List<Double> tmp = new ArrayList<>();
        List<Double> medians = new ArrayList<>();
        double median = 0;

        System.out.println(stream);

        for (int i = 0; i < stream.size(); i++) {
            tmp.add((double) stream.get(i));
            Collections.sort(tmp);
            if (i == 0) {
                median = tmp.get(0);
                medians.add(median);
            } else if (i == 1) {
                median = (tmp.get(0) + tmp.get(1)) / 2;
                medians.add(median);
            } else if (tmp.size() > 1 && (tmp.size() % 2) == 0) {
                median = (tmp.get(tmp.size() / 2) + tmp.get(((tmp.size()) / 2) - 1)) / 2;
                medians.add(median);
            } else {
                median = tmp.get(tmp.size() / 2);
                medians.add(median);
            }
        }
        System.out.println(medians);
    }
}
