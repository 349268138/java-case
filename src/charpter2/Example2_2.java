package charpter2;

public class Example2_2 {
    public static void main (String args[ ]){
        int c=128;
        long d=77777L;
        float f=2e3f; //2 * 10的3次方
        double g=3.14e-300d;   //指数表示法
        double result=f*g;
//        System.out.println("f="+f);
//        System.out.println("g="+g);
//        System.out.println("rerult="+result);

        g=1234.123456789;     //小数表示法
        c=(int)d;
        f=(float)g;   //导致精度的损失
        System.out.print(" c= "+c);
        System.out.println(" d= "+d);
        System.out.println("f="+f);
        System.out.println("g="+g);
    }
}
