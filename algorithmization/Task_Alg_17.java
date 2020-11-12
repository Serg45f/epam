package algorithmization;

/**
 * Сформировать квадратную матрицу порядка N по правилу:
 *
 * A[I,J] = sin((I^2-J^2)/N)
 *
 * и подсчитать количество положительных элементов в ней.
 */

public class Task_Alg_17 {
    public static void main(String[] args) {
        int n = 20; // строк, столбцов квадратной матрицы
        int count =0;

        double[][] matrix = new double[n][n]; // инициализация матрицы n * n;

        // инициализация элементов матрицы n * n;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                matrix[i][j] = Math.sin((i*i-j*j)/n);

            }
        }
        // вывод на экран
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if(matrix[i][j]<0)System.out.format(" %.3f ",matrix[i][j]);
                else if(matrix[i][j]>0){
                     System.out.format("  %.3f ",matrix[i][j]);
                     count++;
                }
                else System.out.format("  %.3f ",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" Количеcтво положительных: " + count);
    }
}
