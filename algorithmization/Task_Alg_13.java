package algorithmization;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец
 *
 *
 */
public class Task_Alg_13 {
    public static void main(String[] args) {
        final int n = 10, // строк
                  m = 25, // столбцов
                  k = 8,  // k-я (от 0) строка
                  p = 19;  // p-й (от 0) столбец

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

        // вывод на экран элементов k-ой строки и р-го столбца
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if((k<n && i==k) || (p<m && j==p))System.out.print(matrix[i][j]+" ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
