package top.mowangblog.code.exception_;

/**
 * JavaStudy
 * runtimeException
 *
 *类型转换异常
 *
 * @author : Xuan Li
 * @date : 2021-09-04 13:12
 **/
public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        AnClass anClass = new BnClass();
        //可以
        BnClass bnClass = (BnClass) anClass;
        //类型转换异常
        CnClass cnClass = (CnClass) anClass;
    }
}
class AnClass{};
class BnClass extends AnClass{};
class CnClass extends AnClass{};
