package basics_of_software_code_development;

/**
 * Basic of software code development
 * Линейные программы
 * Задание 5. Дано татуральное число Т,которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * HHч MMмин SSс
 *
  */
public class Task_Basic_5 {
    public static void main(String[] args) {
        int t = 256895, hh, mm ,ss;
        hh=t/3600;
        mm=(t-hh*3600)/60;
        ss=(t-hh*3600-mm*60);

        System.out.println(hh+"ч "+mm+"мин "+ss+"с");

    }
}
