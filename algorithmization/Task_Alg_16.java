package algorithmization;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 *   1   1   1 ...  1   1
 *   0   1   1 ...  1   0
 *   0   0   1 ...  0   0
 *      ...
 *   0   1   1 ...  1   0
 *   1   1   1 ...  1   1
 *
 */

public class Task_Alg_16 {
    public static void main(String[] args) {
        int n = 11; // строк, столбцов квадратной матрицы (n - четное)
        if(n%2!=0){
            n++;
            System.out.println("N увеличено на 1, т.к. должно быть четным\n");
        }
        int[][] matrix = new int[n][n]; // инициализация матрицы n * n;

        // инициализация элементов матрицы n * n;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if(
                        i<n/2 && ((j<n+1 && j>=n-i) || (j>=0 && j<=i-1)) ||
                        i>=n/2 && ((j<n+1 && j>=n-(n-i-1) || (j>=0 && j<=n-i-2)))

                )matrix[i][j] = 0;
                else matrix[i][j] = 1;
            }
        }
        // вывод на экран
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

