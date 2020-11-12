package basics_of_software_code_development;

/**
 *
 * Вычислить значение функции:
 *        {x^2-3x+9,x<=3;
 *   f(x)=
 *        {1/x^3+6,x>3;
 *
 */
public class Task_Basic_11 {
    public static void main(String[] args) {
        double y,x;
        x=3.1;

        if(x<=3)y=x*x-3*x+9;
        else y=1/(Math.pow(x,3)+6);
        System.out.println("При x = "+x+" f(x)= "+y);
    }

}
