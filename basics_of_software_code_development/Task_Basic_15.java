package basics_of_software_code_development;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Найти произведения квадратов первых 200 чисел
 *
 */
public class Task_Basic_15 {
    public static void main(String[] args) {
/*      // 98 - предел для double
        double res = 1;
        for(int i=1;i<=98;i++){
            res=res*(i*i);
        }
        System.out.println(res);
    }

 */
        BigDecimal res = BigDecimal.valueOf(1);
        for(int i=1;i<=200;i++){
            res = res.multiply(BigDecimal.valueOf(i*i));

        }
        System.out.println(res);
    }

}
