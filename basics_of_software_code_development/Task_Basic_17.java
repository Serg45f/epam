package basics_of_software_code_development;

/**
 *Вывести на экран  соответсвующий код между символами и их численными обзначениями в памяти компьютера
 *
 */
public class Task_Basic_17 {
    public static void main(String[] args) {
        for(int i = 0;i<10000;i++){
            System.out.println(i+" - "+(char)i);
        }
    }
}
