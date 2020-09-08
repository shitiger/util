package proxy.CGlibProxy;

import proxy.JDKProxy.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/17
 */
public class Man {

    public String say(){
        System.out.println("121241414213414");
        return "stone";
    }

    public static void main(String[] args) {
        CGLIBProxy cglib = new CGLIBProxy();
        Man bookFacedImpl = (Man) cglib.getInstance(new Man());
        bookFacedImpl.say();

    }
}
