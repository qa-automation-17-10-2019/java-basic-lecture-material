package hillel.lecture2;

/**
 * Created by alpa on 10/20/19
 */
public class CalculationMain {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("a: " + a);
        int b = 10;
        System.out.println("b: " + b);

        float c = 10.5f;

        float result = a + b * c;
        System.out.println("operation: a + b * c");

        float result2 = (a + b) * c;

        System.out.println("Result: " + result);
        System.out.println("Result2: " + result2);

        double result3 = 345667.124D * 34.3D;

        System.out.println("Result3: " + result3);
    }
}
