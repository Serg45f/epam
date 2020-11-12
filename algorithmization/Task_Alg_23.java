package algorithmization;

/**
 * Отсортировать столбцы матрицы по возростанию и убыванию значений элементов
 *
 */

public class Task_Alg_23 {
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
        drawMatrix(matrix,n);
        System.out.println();

        // сортировка элементов столбцов по возрастанию
        // вывод на экран
        System.out.println("по возрастанию");
        drawMatrix(sortAscMatrixColElems(matrix,n),n);
        System.out.println();

        // сортировка элементов столбцов по убыванию
        // вывод на экран
        System.out.println("по убыванию");
        drawMatrix(sortDescMatrixColElems(matrix,n),n);
        System.out.println();

    }

    //вывод на экран
    public static void drawMatrix(int[][] matrix,int rows){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[rows-1].length;j++){
                if(matrix[i][j]>=10)System.out.print("  "+matrix[i][j]+" ");
                else if(matrix[i][j]>=0 && matrix[i][j]<10)System.out.print("   "+matrix[i][j]+" ");
                else if(matrix[i][j]>-10 && matrix[i][j]<0)System.out.print("  "+matrix[i][j]+" ");
                else System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //сортировка элементов строк по возрастанию
    public static int[][] sortAscMatrixColElems(int[][] matrix,int rows){

        int temp;
        for(int j = 0; j<matrix[rows-1].length;j++){
            for(int k =0;k<matrix.length;k++) {
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] > matrix[i+1][j]) {
                        temp = matrix[i+1][j];
                        matrix[i+1][j] = matrix[i][j];
                        matrix[i][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    //сортировка элементов строк по убыванию
    public static int[][] sortDescMatrixColElems(int[][] matrix,int rows){

        int temp;
        for(int j = 0; j<matrix[rows-1].length;j++){
            for(int k =0;k<matrix.length;k++) {
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] < matrix[i+1][j]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i+1][j];
                        matrix[i+1][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }
}

