package algorithmization;

/**
 * Сформировать случайную матрицу m x n, состоящую из нуле и единиц,
 * причем в каждом столбце число единиц равно номеру столбца
 *
 */
public class Task_Alg_24 {
    public static void main(String[] args) {
        int n = 15, // строк
            m = 10, // столбцов
            rand,
            count = 0;
        int[][] matrix = new int[n][m]; // инициализация матрицы n * m;

        // инициализация элементов матрицы n * m;
        for (int j = 0; j < matrix[n-1].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                rand = 0 + (int)(Math.random() * 2);
                if(rand == 1 && count==j) rand = 0;
                if(rand == 0 && matrix.length - i <= (m-count)) rand = 1;
                matrix[i][j] = rand;
                if(matrix[i][j]==1)count++;
            }
            count=0;
        }

        // вывод на экран
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[n - 1].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
