package concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author stone tiger
 * @Description: return之后先把返回值放在操作数栈中缓存，然后执行finally里的代码，然后在return。所以 latch.countDown()执行完了之后，futrue里还没有return的值。
 * @date 2019/12/6
 */
public class CountDownLatchDemo {
    private static final ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) throws InterruptedException {
      /*for (int i = 0; i < 1000; i++) {
            testResult();
        }*/
    }

    public static void testResult() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);
        Future<String> one = executorService.submit(() -> {
            try {
                return "ONE";
            } finally {
                latch.countDown();
            }
        });
        Future<String> two = executorService.submit(() -> {
            try {
                return "TWO";
            } finally {
                latch.countDown();
            }
        });
        Future<String> three = executorService.submit(() -> {
            try {
                return "Three";
            } finally {
                latch.countDown();
            }
        });
        latch.await(1, TimeUnit.MILLISECONDS);

        //项目中，通过判断线程是否执行完成，获取线程结果
        if (!one.isDone()) {
            System.out.println(" 线程1没有运行完");
        }

        if (!two.isDone()) {
            System.out.println(" 线程2没有运行完");
        }

        if (!three.isDone()) {
            System.out.println(" 线程3没有运行完");
        }
    }
}
