package top.mowangblog.code.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Java-Learn
 * 工厂代理对象
 *
 * @author : Xuan Li
 * @date : 2021-09-24 12:43
 **/
public class FactoryProxy {
    public static Object getProxyInstance(Object coverProxy){

        return Proxy.newProxyInstance(coverProxy.getClass().getClassLoader(), coverProxy.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理对象执行代码");
                return method.invoke(coverProxy,args);
            }
        });
    }
}
