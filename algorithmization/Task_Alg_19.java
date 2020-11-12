package algorithmization;
/**
 * Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму.
 */

public class Task_Alg_19 {
    public static void main(String[] args) {

        int n = 3; // строк, столбцов квадратной матрицы
        int sum = 0, max = 0, colNumb = 0;
        int temp = 0;

        int[][] matrix = new int[n][n]; // инициализация матрицы n * n;

        // инициализация элементов матрицы n * n;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                matrix[i][j] = 10+(int)(Math.random()*90);
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
        for(int j = 0; j<matrix[n-1].length;j++) {
            for (int i = 0; i < matrix.length; i++) {
                sum +=matrix[i][j];
            }
            System.out.println("Сумма элементов столбца "+(j+1)+" " + sum + ";");
            if(max<sum){
                max = sum;
                colNumb = j+1;
            }
            sum=0;
        }

        System.out.println("\nМаксимальная сумма "+max+" элемнтов столбца "+colNumb);

    }
}
