package basics_of_software_code_development;

import javax.annotation.processing.SupportedSourceVersion;
import java.math.BigInteger;
import java.util.*;

/**
 * Даны два числа.
 * Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task_Basic_19 {
    public static void main(String[] args) {
        BigInteger a, b ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое натуральное число:");
        a = new BigInteger(sc.next());
        System.out.println("Введите еще одно натуральное число:");
        b = new BigInteger(sc.next());

        char[] astr = String.valueOf(a).toCharArray();
        char[] bstr = String.valueOf(b).toCharArray();
        Set<Character> nunbers = new HashSet<>();  //чтобы убрать дубликаты

        for(int i = 0; i<astr.length;i++){
            for(int j = 0; j<bstr.length;j++){
                if(astr[i] == bstr[j])nunbers.add(astr[i]);
            }
        }

        System.out.println("Общие цифры:");
        for(char ch:nunbers){
            System.out.println(ch);
        }
    }
}
