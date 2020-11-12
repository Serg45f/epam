package algorithmization;

/**
 * Дана квадратная матрица.
 * Вывести на экрна элементы на диагоналях
 *
 */

public class Task_Alg_12 {
    public static void main(String[] args) {
        final int n = 11; // строк, столбцов квадратной матрицы
        int[][] matrix = new int[n][n]; // инициализация матрицы n * n;

        // инициализация элементов матрицы n * n;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                matrix[i][j] =10 + (int)(Math.random()*90); //двузначные положительные элементы для красоты
            }
        }

        // вывод на экран
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // вывод на экран элементов диагоналей
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if(i==j || i==n-1-j )System.out.print(matrix[i][j]+" ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
