package basics_of_software_code_development;

/**
 *
 * Заданы размеры А,В прямоугольного отверстия и размеры x, y, z кирпича.
 * Определить, пройдет ли кирпич через отверстие
 *
 */
public class Task_Basic_10 {
    public static void main(String[] args) {
        double a,b,x,y,z;
        a=12.1;
        b=7.6;

        x=12;
        y=24;
        z=7.5;

        if(
                Math.min(a,b)>Math.min(x,y) && Math.max(a,b)>Math.max(x,y) ||
                Math.min(a,b)>Math.min(x,z) && Math.max(a,b)>Math.max(x,z) ||
                Math.min(a,b)>Math.min(y,z) && Math.max(a,b)>Math.max(y,z)
        )
            System.out.println("The brick fits");
        else System.out.println("The brick does not fit");

    }
}
