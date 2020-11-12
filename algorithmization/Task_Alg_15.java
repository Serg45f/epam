package algorithmization;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 *   1   1   1   1  ... 1
 *   2   2   2   2  ... 0
 *   3   3   3   0  ... 0
 *      ...
 *  n-1 n-1  0   0  ... 0
 *   n   0   0   0  ... 0
 *
 */

public class Task_Alg_15 {
    public static void main(String[] args) {
        int n = 13; // строк, столбцов квадратной матрицы (n - четное)
        if(n%2!=0){
            n++;
            System.out.println("N увеличено на 1, т.к. должно быть четным");
        }
        int[][] matrix = new int[n][n]; // инициализация матрицы n * n;

        // инициализация элементов матрицы n * n;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if(j<n+1&&j>=n-i)matrix[i][j] =0;
                else matrix[i][j] = i+1;
            }
        }

        // вывод на экран
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if(i+1<10||(j<n+1&&j>=n-i)) System.out.print(" "+matrix[i][j]+" ");
                else System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}

