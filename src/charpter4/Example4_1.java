package charpter4;

class XiyoujiRenWu {
    float height,weight;
    String head, ear,hand,foot, mouth;
    void speak(String s) {
        System.out.println(s);
    }
}
public class Example4_1 {
    public static void main(String args[]) {
        XiyoujiRenWu zhubajie;       //声明对象
        zhubajie=new XiyoujiRenWu(); //为对象分配内存，使用new 运算符和默认的构造方法
    }
}



