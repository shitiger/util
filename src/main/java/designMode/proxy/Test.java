package designMode.proxy;

import designMode.proxy.jdkproxy.JDKProxy;
import designMode.proxy.jdkproxy.Person;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class Test {

    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        Person person = (Person) jdkProxy.getProxt(Person.class);
        person.say("s");
    }
}
