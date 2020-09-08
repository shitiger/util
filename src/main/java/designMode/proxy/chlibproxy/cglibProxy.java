package designMode.proxy.chlibproxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class cglibProxy implements MethodInterceptor{


    public Object getInstance(Class<?> target){
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target);
        // 设置回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("事务开始。。。");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("事务结束。。。");
        return result;
    }
}
