package algorithmization;

/**
 * Матрицу 10*20 заполнить случайными числами от 0 до 15. Вывести на экран матрицу и номера строк,
 * в которых число 5 встречается 3 и более раз
 *
 *
 */

public class Task_Alg_21 {
    public static void main(String[] args) {
        final int n = 10, // строк
                  m = 20; // столбцов
        int[][] matrix = new int[n][m]; // инициализация матрицы n * m;

        // инициализация элементов матрицы n * m;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                matrix[i][j] =0 + (int)(Math.random()*16); //двузначные положительные элементы для красоты
            }
        }

        // вывод на экран
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if(matrix[i][j]>=0 && matrix[i][j]<10)System.out.print(" "+matrix[i][j]+"  ");
                else System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println();

        int count = 0;
        System.out.print("Номера строк, в которых 5 встречается три и более раз: ");
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if(matrix[i][j]==5)count++;
           }
            if(count >= 3) System.out.print((i+1)+", ");
            count=0;
        }
        System.out.println();
    }
}

