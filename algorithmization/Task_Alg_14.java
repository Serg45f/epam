package algorithmization;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
 *   0   1   2   3  ... n
 *   1   n  n-1 n-2 ... 1
 */

public class Task_Alg_14 {
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
                    if(i%2==0)matrix[i][j] =1+j;
                    else matrix[i][j] =n-j;
                }
        }

        // вывод на экран
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
