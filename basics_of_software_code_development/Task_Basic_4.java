package basics_of_software_code_development;

/**
 * Basic of software code development
 * Линейные программы
 * Задание 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа:
 *
 */
public class Task_Basic_4 {
    public static void main(String[] args) {
        float r =  123.456F;
        System.out.println("R is "+r);
        int nnn, ddd;
        nnn = (int)r;
        //System.out.println(nnn);
        ddd =(int)((r-nnn)*1000);
        //System.out.println(ddd);
        r = ddd+(float)nnn/1000;
        System.out.println("And now R is "+r);

    }
}
