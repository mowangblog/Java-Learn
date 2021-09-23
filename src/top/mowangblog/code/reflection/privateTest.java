package top.mowangblog.code.reflection;

/**
 * JavaStudy
 * 测试
 *
 * @author : Xuan Li
 * @date : 2021-09-22 20:51
 **/
public class privateTest {
    private String name = "helloKitty";

    @Override
    public String toString() {
        return "privateTest{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public privateTest() {
    }

    public privateTest(String name) {
        this.name = name;
    }
}
