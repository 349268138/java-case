package charpter2;

import java.math.BigDecimal;

public class Example2_2_1 {
    public static void main (String args[ ]){
        float y=12346000000f;
        float x=12345999999.123456789f;
        System.out.println(x);
        System.out.println(y-x);

        BigDecimal bigDecimalY = new BigDecimal("12346000000");
        BigDecimal bigDecimalX = new BigDecimal("12345999999.123456789");
        System.out.println(bigDecimalY.subtract(bigDecimalX));
    }
}
