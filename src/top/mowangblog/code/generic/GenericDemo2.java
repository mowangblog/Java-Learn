package top.mowangblog.code.generic;

/**
 * JavaStudy
 * 泛型demo
 *
 * @author : Xuan Li
 * @date : 2021-09-11 23:26
 **/
public class GenericDemo2 {
    public static void main(String[] args) {
        GenericTest<String> stringGenericTest = new GenericTest<String>("李煊");
        stringGenericTest.getValueClass();

        GenericTest<Integer> stringGenericTest2 = new GenericTest<Integer>(111);
        stringGenericTest2.getValueClass();

        GenericTest<GenericTest<String>> stringGenericTest3 = new GenericTest<GenericTest<String>>(new GenericTest<String>("lixuan"));
        stringGenericTest3.getValueClass();
        stringGenericTest3.getValue().getValueClass();
    }
}
class GenericTest<E>{
    public E value;

    public GenericTest(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public void getValueClass(){
        System.out.println(value.getClass());
    }
}
