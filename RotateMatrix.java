package DailyInterView;

import training.Methods;

public class RotateMatrix extends Methods {
    public static void main(String[] args) {

        /**
         * @Source: This problem was recently asked by Uber:
        Given a square 2D matrix (n x n), rotate the matrix by 90 degrees clockwise.
         */

        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        int[][] result = {{7,4,1},
                          {8,5,2},
                          {9,6,3}};

        int[][] tmp = new int[matrix.length][matrix.length];

        for (int col = matrix.length - 1; col >= 0; col--) {               // Обхожда по колони, не по-редове.
            for (int row = 0; row < matrix.length; row++) {                // т.е: За всеки ред От Дадената колона.
                tmp[row][matrix.length - 1 - col] = matrix[col][row];      // tmp[0][0] = matrix[0][2];
            }
        }

        print2DArray(tmp);
    }
}
