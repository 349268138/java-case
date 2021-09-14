package charpter4.test;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/9/14.
 */
public class Tea {
    //茶氨酸
    long vector1;
    //茶多酚
    long vector2;
    //茶多糖
    long vector3;

    public Tea() {
        vector1 = 10;
        vector2 = 5;
        vector3 = 10;
    }

    public Tea(long v1, long v2, long v3) {
        vector1 = v1;
        vector2 = v2;
        vector3 = v3;
    }

    public static void printTeaInfo() {
        System.out.println("this is Tea");
    }

    public boolean healthCheck(long healthValue) {
        long result = vector1 * vector2 * vector3;
        return result > healthValue;
    }

    public boolean healthCheck() {
        return vector1 * vector2 * vector3 > 1000L;
    }

    public long getVector1() {
        return vector1;
    }

    public void setVector1(long vector1) {
        this.vector1 = vector1;
    }

    public long getVector2() {
        return vector2;
    }

    public void setVector2(long vector2) {
        this.vector2 = vector2;
    }

    public long getVector3() {
        return vector3;
    }

    public void setVector3(long vector3) {
        this.vector3 = vector3;
    }
}
