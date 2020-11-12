package algorithmization;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы,
 * у которых ПЕРВЫЙ элемент БОЛЬШЕ ПОСЛЕДНЕГО
 *
 *
 */

public class Task_Alg_11 {
    public static void main(String[] args) {
        final int n = 10, // строк
                  m = 25; // столбцов
        int[][] matrix = new int[n][m]; // инициализация матрицы n * m;

        // инициализация элементов матрицы n * m;
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

        // вывод нечетных (начиная с 0-го столбца и т.д.) столбцов по условию на экран
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if(j%2!=0 && matrix[0][j]>matrix[n-1][j])System.out.print(matrix[i][j]+" ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
