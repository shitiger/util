package proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/6/19
 */
public class Proxy<T> implements InvocationHandler {


    private Class<T> t;

    public Proxy(Class<T> target){
        this.t = target;
    }

    public T getProxyInstance(){
        // 1.第一个参数为代理接口的相同的类加载器，第二个为的代理类的接口，第一个参数和第二个参数可以生成一个Class proxy然后第三个参数为生产代理的实际类
        return (T) java.lang.reflect.Proxy.newProxyInstance(t.getClassLoader(),new Class[] { t },this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy begin");
     //   Object obkect = method.invoke(t,args);
        System.out.println("proxy end");
        return null;
    }
}
