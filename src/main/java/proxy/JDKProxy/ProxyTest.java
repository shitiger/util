package proxy.JDKProxy;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/6/19
 */
public class ProxyTest {
    public static void main(String[] args) {
        Animal animal = new Proxy<>(Animal.class).getProxyInstance();
        Animal animal2 = new Proxy<>(Animal.class).getProxyInstance();

        animal.eat("111");
        animal2.eat("2222");

  /*      HashMapThread hmt0 = new HashMapThread();
        HashMapThread hmt1 = new HashMapThread();
        HashMapThread hmt2 = new HashMapThread();
        HashMapThread hmt3 = new HashMapThread();
        HashMapThread hmt4 = new HashMapThread();
        hmt0.start();
        hmt1.start();
        hmt2.start();
        hmt3.start();
        hmt4.start();
     }
     static class HashMapThread extends Thread {
        private static AtomicInteger ai = new AtomicInteger(0);
        private  static Map<Integer, Integer> map = new HashMap<Integer, Integer>(1);

        @Override
        public void run() {
            while (ai.get() < 100000) {
                map.put(ai.get(), ai.get());
                ai.incrementAndGet();
            }
            System.out.println(Thread.currentThread().getName() + "执行结束完");
        }

    }*/
    }
}
