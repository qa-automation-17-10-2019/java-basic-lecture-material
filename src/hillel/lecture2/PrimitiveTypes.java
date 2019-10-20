package hillel.lecture2;

/**
 * Created by alpa on 10/19/19
 */
public class PrimitiveTypes {

//  1 byte
//  range: -128 to 127
//  default: 0
    byte a;

//  2 bytes
//  range: -32768 to 32767
//  default: 0
    short b;

//   4 bytes
//  Range: -2 147 483 648 to 2 147 483 647
//  Default: 0
    int c;

//   8 bytes
//  range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//  default: 0L
    long d;

//  2 bytes
//  ‘\u0000’ to ‘\uFFFF’
//  Default: ‘\u0000’
//  Unicode
    char e = '\uFFFF';

//  4 bytes
//  range: ±3.402823347e+38F (6-7 digits after ‘.’)
//  default: 0.0f
    float f;

//  8 bytes
//  ±1.79769313486231570E+308
//  15 digits after ‘.’
//  default: 0.0d
    double g;

//  1 bit
//  default: false
    boolean k;
}
