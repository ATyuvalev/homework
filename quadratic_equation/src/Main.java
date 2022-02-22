public class Main {
    public static void main(String[] args) {
        double a, b, c, D, x, x1, x2;
        String outv;

        a=2;
        b=4;
        c=2;

        D = b * b - 4 * a * c; //вычисляем дискриминант

        if (D > 0) {
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            outv = "Корни уравнения: x1 = " + x1 + ", x2 = " + x2;
        }
        else if (D == 0) {
            x = -b / (2 * a);
            outv = "Уравнение имеет один корень: x = " + x;
        }
        else {
            outv = "В уравнении нет действительных корней";
        }
        System.out.println(outv);
    }
}