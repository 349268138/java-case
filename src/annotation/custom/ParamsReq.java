package annotation.custom;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/12/5.
 */
public class ParamsReq {
    @ValidationCheck(allowEmpty = false)
    private String name;

    @ValidationCheck(allowEmpty = false, minLength = 3, maxLength = 60)
    private String motto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}
