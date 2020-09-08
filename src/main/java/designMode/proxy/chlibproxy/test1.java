package designMode.proxy.chlibproxy;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class test1 {

    public static void main(String[] args) {
        cglibProxy cglibProxy = new cglibProxy();
        IPerson o = (IPerson)cglibProxy.getInstance(IPerson.class);
        o.say();
    }
}
