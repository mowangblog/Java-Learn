package top.mowangblog.code.proxy;

/**
 * Java-Learn
 * 动态代理demo
 *
 * @author : Xuan Li
 * @date : 2021-09-24 12:39
 **/
public class ProxyDemo {
    public static void main(String[] args) {
        Factory proxyInstance = ((Factory) FactoryProxy.getProxyInstance(new ToolFactory()));
        proxyInstance.makeGoods();
        proxyInstance.returnGoods();

        //根据传入的被代理类的不同生成不同的代理类
        Factory proxyInstance2 = ((Factory) FactoryProxy.getProxyInstance(new ClothFactory()));
        proxyInstance2.makeGoods();
        proxyInstance2.returnGoods();
    }
}


interface Factory{
    /**
     * 制作商品
     */
    void makeGoods();

    /**
     * 商品退货
     */
    void returnGoods();
}
class ToolFactory implements Factory{

    @Override
    public void makeGoods() {
        System.out.println("制作工具");
    }

    @Override
    public void returnGoods() {
        System.out.println("工具退货");
    }
}

class ClothFactory implements Factory{
    @Override
    public void makeGoods() {
        System.out.println("制作衣服");
    }

    @Override
    public void returnGoods() {
        System.out.println("衣服退货");
    }
}
