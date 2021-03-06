package basics_of_software_code_development;

/**
 * Даны три точки A(x1,y1), B(x2,y2), C(x3,y3).
 * Определить, будут ли они расположены на одной прямой.
 */
public class Task_Basic_9 {
    public static void main(String[] args) {

        /**
        *1.Находим уравнение прямой (y1-y2)x+(x2-x1)y+(x1y2-x2y1)=0 или Ax+By+C=0 из двух любых точек.
        *2.Подставляем координаты третьей точки (остальных точек) в это уравнеие.
        *Усли удовлетворяют уравнеию,  то принадлежит прямой. Тогда все точки лежат на одной прямой.
        */
        double x1,x2,x3,y1,y2,y3;

        x1=0;
        y1=0;

        x2=2;
        y2=2;

        x3=3;
        y3=3;

        if((y1-y2) * x3 + (x2-x1) * y3 + (x1*y2 - x2*y1) == 0) System.out.println("На одной прямой");
        else System.out.println("Не на одной прямой");

    }


}
