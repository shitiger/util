package Bloom;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.zip.CheckedOutputStream;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/6/10
 */
public class Test {

    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException {
        AbstractQueuedSynchronizer abstractQueuedSynchronizer = new AbstractQueuedSynchronizer() {
            @Override
            protected boolean tryAcquire(int arg) {
                return super.tryAcquire(arg);
            }

            @Override
            protected boolean tryRelease(int arg) {
                return super.tryRelease(arg);
            }

            @Override
            protected int tryAcquireShared(int arg) {
                return super.tryAcquireShared(arg);
            }

            @Override
            protected boolean tryReleaseShared(int arg) {
                return super.tryReleaseShared(arg);
            }

            @Override
            protected boolean isHeldExclusively() {
                return super.isHeldExclusively();
            }

            @Override
            public String toString() {
                return super.toString();
            }
        };
    }
}
