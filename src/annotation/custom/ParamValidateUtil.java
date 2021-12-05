package annotation.custom;

import java.lang.reflect.Field;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/12/5.
 */
public class ParamValidateUtil {
    public static void valid(Object o) throws ClassNotFoundException, IllegalAccessException {
        for (Field field : Class.forName(o.getClass().getName()).getDeclaredFields()) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(ValidationCheck.class)) {
                ValidationCheck validationCheck = field.getAnnotation(ValidationCheck.class);

                //判断是否允许为空
                Object value = field.get(o);
                boolean valueIsNull = (value == null || "".equals(value));
                if (!validationCheck.allowEmpty() && valueIsNull) {
                    throw new RuntimeException(field.getName() + "不能为空");
                }

                //判断最大长度
                if (validationCheck.maxLength() > 0) {
                    if (value.toString().length() > validationCheck.maxLength()) {
                        throw new RuntimeException(field.getName() + "长度大于" + validationCheck.maxLength());
                    }
                }

                //判断最小长度
                if (validationCheck.minLength() > 0) {
                    if (value.toString().length() < validationCheck.minLength()) {
                        throw new RuntimeException(field.getName() + "长度小于" + validationCheck.minLength());
                    }
                }
            }
        }
    }
}
