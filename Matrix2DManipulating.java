package DailyInterView;

import training.Methods;

public class Matrix2DManipulating extends Methods {
    public static void main(String[] args) {



        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        int[][] tmp = new int[matrix.length][matrix.length];

        // ------------------------------------------------------------------------------------------------------------


//         1-я ред от "matrix" го прави 1-и ред в "tmp"
//         2-я ред от "matrix" го прави 2-и ред в "tmp"
//         3-я ред от "matrix" го прави 3-и ред в "tmp"

        for (int col = 0; col < matrix.length ; col++) {                            // 1, 4, 7   // 1, 2, 3
            for (int row = 0; row < matrix[col].length; row++) {                    // 2, 5, 8   // 4, 5, 6
                tmp[col][row] = matrix[row][col];                                   // 3, 6, 9   // 7, 8, 9
            }
        }
        print2DArray(tmp);
        System.out.println();

        for (int col = 0; col < matrix.length ; col++) {                             // 1, 2, 3   // 1, 2, 3
            for (int row = 0; row < matrix[col].length; row++) {                     // 4, 5, 6   // 4, 5, 6
                tmp[col][row] = matrix[col][row];                                    // 7, 8, 9   // 7, 8, 9

            }
        }
        print2DArray(tmp);
        System.out.println();

        // ------------------------------------------------------------------------------------------------------------

        
        // ------------------------------------------------------------------------------------------------------------

    }
}
