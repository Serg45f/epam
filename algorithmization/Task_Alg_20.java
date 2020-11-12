package algorithmization;

    /**
     * Дана квадратная матрица.
     * Найти положительные элемнеты главной диагонали.
     *
     */

public class Task_Alg_20 {
    public static void main(String[] args) {
        final int n = 11; // строк, столбцов квадратной матрицы
        int[][] matrix = new int[n][n]; // инициализация матрицы n * n;

        // инициализация элементов матрицы n * n;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                matrix[i][j] =-90 + (int)(Math.random()*190); //двузначные положительные элементы для красоты
            }
        }

        // вывод на экран
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if(matrix[i][j]>=10)System.out.print("  "+matrix[i][j]+" ");
                else if(matrix[i][j]>=0 && matrix[i][j]<10)System.out.print("   "+matrix[i][j]+" ");
                else if(matrix[i][j]>-10 && matrix[i][j]<0)System.out.print("  "+matrix[i][j]+" ");
                else System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // вывод на экран элементов главной диагонали
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                if(i==j && matrix[i][j]>0 && matrix[i][j]<10)System.out.print("   "+matrix[i][j]+" ");
                else if(i==j && matrix[i][j]>=10)System.out.print("  "+matrix[i][j]+" ("+(i+1)+","+(j+1)+")");
                else System.out.print("     ");
            }
            System.out.println();
        }
    }
}


