package charpter4;

class AAACase16 {
    private int money;
    private int getMoney() {
        return money;
    }
    public static void main(String args[]) {
        AAACase16 exa=new AAACase16();                 //对象exa在AAA类中
        exa.money=3000;
        int m=exa.getMoney();
        System.out.println("money="+m);
    }

    public double print(float len) {
        return 3.14*len*len;
    }
}

