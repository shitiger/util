package concurrent;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/30
 */
public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        User3 ser3 = new User3();
        ser3.setDaemon(true);
        ser3.setName("3232323");
        ser3.start();
        Thread.sleep(100);
        ser3.join();
        ForkJoinPool forkJoinPool =  new ForkJoinPool();
        AtomicInteger atomicInteger = new AtomicInteger(3);
        atomicInteger.getAndIncrement();
        atomicInteger.incrementAndGet();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        atomicBoolean.getAndSet(true);
   }

    private static class User3 extends Thread {

        @Override
        public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("error2:"+Thread.currentThread().isInterrupted());
                    interrupt();
                    e.printStackTrace();
                }finally {
                    System.out.println("finally");
            }
        }
    }
    private static class User1 implements Runnable {

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted())
                System.out.println(Thread.currentThread().getName());
        }
    }
}
