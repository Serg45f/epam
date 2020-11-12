package algorithmization;

import java.util.Scanner;

/**
 * В числовой матрице поменять местами два любых столбца,
 * т.е. все элементы одного столбца поменять местами с элементами другого.
 * Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task_Alg_18 {
    public static void main(String[] args) {

            int n = 5; // строк, столбцов квадратной матрицы
            int n1,n2;
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
        Scanner sc = new Scanner(System.in);

        System.out.println("\nВведите номера столбцов: ");
        System.out.println("№ 1-го столбца от 1 до "+n+" : ");
        n1 = sc.nextInt();
        System.out.println("№ 2-го столбца: от 1 до "+n+" : ");
        n2 = sc.nextInt();
        System.out.println();

            if(n1>=1 && n1<=n && n2>=1 && n2<=n ){
                for(int i = 0; i<matrix.length;i++){
                    temp = matrix[i][n1-1];
                    matrix[i][n1-1] = matrix[i][n2-1];
                    matrix[i][n2-1] = temp;
                }
            }
            else System.out.println("Все осталось без изменений т.к. вы указали столбцы за пределами диапазона.");

        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[n-1].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
