package designMode.proxy.jdkproxy;

import org.apache.poi.ss.formula.functions.T;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class JDKProxy<T> implements InvocationHandler {

    public T getProxt(Class<T> clazz){
        return (T)Proxy.newProxyInstance(clazz.getClassLoader(),new Class[]{clazz},this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("111111");
       //System.out.println(method);
        System.out.println(args);
     //   System.out.println("222222222");
        return "22";
    }
}
