package annotation.custom;

import java.lang.annotation.*;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/12/5.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
//@Documented
public @interface ValidationCheck {
    /**
     * 是否为空
     */
    boolean allowEmpty() default true;

    /**
     * 最小长度（针对字符串）
     */
    int minLength() default 0;

    /**
     * 最大长度（针对字符串）
     */
    int maxLength() default 0;
}
