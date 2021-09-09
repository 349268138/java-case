package charpter4;

public class Example4_17 {
   public static void main(String args[]) {
      StudentCase17 zhang=new StudentCase17();
      StudentCase17 geng=new StudentCase17();
      zhang.setAge(23);
      System.out.println("zhang的年龄："+zhang.getAge());
      geng.setAge(25);
      //zhang.age=23;或geng.age=25都是非法的，因为zhang和geng已经不在StudentCase17类中 
      System.out.println("geng的年龄："+geng.getAge());
   }
}



