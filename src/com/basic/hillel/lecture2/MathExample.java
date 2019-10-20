package com.basic.hillel.lecture2;

import static java.lang.Math.*;

/**
 * Created by alpa on 10/19/19
 */
public class MathExample {

    public static void main(String[] args) {

//        Math.abs()   // Returns the absolute value (module)
//        Math.sin()   // Returns the trigonometric sine of an angle
//        Math.asin()  // Returns the arc cosine of a value
//        Math.cos()   // Returns the trigonometric cosine of an angle
//        Math.acos()  // Returns the arc cosine of a value
//        Math.tan()   // Returns the trigonometric tangent of an angle
//        Math.atan()  // Returns the arc tangent of a value
//        Math.PI      // PI number
//        Math.E       // The base of the natural logarithms
//        Math.sqrt()  // square root
//        Math.cbrt()  // cube root
//        Math.log()   // Returns the natural logarithm
//        Math.log10() // Returns the base 10 logarithm
//        Math.exp()   // Exponent
//        Math.pow()   // Returns the value of the first argument raised to the power of the second argument

//        if result NaN - / to zero !!!!!!

        double x = 25.15;
        double result9 = Math.pow(1.1, x) + Math.abs(Math.cos(Math.sqrt(PI * x))) - (3.0 / 8.0);
        System.out.println(result9);
        System.out.println(3.0 / 8.0);

        double x25 = 45.89;
        double result25 = sqrt(sqrt(log10(acos(abs(pow(x25, 3.4) + 2.5 * pow(x25, 1.2)-0.7/cbrt(pow(exp(2.5 * x25), x25))))))) + 1;
        System.out.println(result25);

        double x1 = 20.15;
        double result = Math.pow(1.1, -x1) + Math.abs(Math.cos(Math.sqrt(PI * x1))) - (3.0/ 8.0);
        System.out.println(result);
    }

}
