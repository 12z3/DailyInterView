package DailyInterView;

import training.Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwitterTask extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        timeAndData();

        /*
        -----------------------------------------------------------------------------------
                  TODO: This problem was recently asked by Twitter:      <--
                        Find all words that are concatenations of a list.
                          Input:
                          ["tech", "lead", "techlead", "cat", "cats", "dog", "catsdog"]
                          Output:
                         ['techlead', 'catsdog']

                  TODO: Count the count occurrence of each string in every other string:      <--
                        Пребройте броя на поява на всеки низ във всеки друг низ
                        - All
                        - And
                        - sand
                        - falling wall in sand
       -----------------------------------------------------------------------------------
         */
        //https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java


        //                                          Я ГО ОПРАВИ !!!

        char chr = ' ';
        String word = " Max Temperature is: ";
        StringBuilder strB = new StringBuilder();
        StringBuilder strA = new StringBuilder();
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' '){
                strB.append(word.charAt(i));
                charList.add(word.charAt(i));
            }
        }






    }
}

