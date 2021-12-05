package annotation.custom;

import java.lang.reflect.Field;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/12/5.
 */
public class CustomAnnotationTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        ParamsReq paramsReq = new ParamsReq();
//        paramsReq.setName("kitty");
//        paramsReq.setMotto("good good study, day day up");

        ParamValidateUtil.valid(paramsReq);
    }
}
