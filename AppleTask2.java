package DailyInterView;

public class AppleTask2 {

    /**
     * @Problem: Hi, here's your problem today. This problem was recently asked by Apple:
     *
     * Given a string, we want to remove 2 adjacent characters that are the same,
     * and repeat the process with the new string until we can no longer perform the operation.
     *
     */

    public static void main(String[] args) {
        String inp =  "cabba";
        removeAdjacentDupcted(inp);
    }

    private static void removeAdjacentDupcted(String inp) {
        StringBuilder stb = new StringBuilder(inp);
        int count = 0;

        while (count < stb.length()){
            for (int i = 0; i < stb.length() - 1; i++) {
                if (stb.charAt(i) == stb.charAt(i + 1)) {
                    stb.deleteCharAt(i);
                    stb.deleteCharAt(i);
                    count++;

                }
            }
        }
        System.out.println(stb);
    }
}
