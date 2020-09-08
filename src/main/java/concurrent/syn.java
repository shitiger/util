package concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/31
 */
public class syn {
    int a = 0;
    boolean flag = false;

    public void write(){
        a = 1;                 // 1
        flag = true;           // 2
    }

    public void read(){
        if(flag){               // 3
            int i = a*a;        // 4
            System.out.println("i的值为："+i);
        }

    }
    public static void main(String[] args) throws InterruptedException {
        syn syn = new syn();
        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                syn.read();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                syn.write();
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();
        // CountDownLatch
        CountDownLatch countDownLatch = new CountDownLatch(10);
        countDownLatch.countDown();
        countDownLatch.await();
        // ReentrantLock
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();
        // Condition
        Condition condition = reentrantLock.newCondition();
        condition.await();
        condition.signal();
        condition.signalAll();

        // ReentrantReadWriteLock
        ReentrantReadWriteLock reentrantReadWriteLock =new ReentrantReadWriteLock();
        Lock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        writeLock.unlock();
        Lock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        readLock.unlock();

        // Semaphore
        Semaphore semaphore = new Semaphore(10);
        semaphore.acquire();
        semaphore.release();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

}
