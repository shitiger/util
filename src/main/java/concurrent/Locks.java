package concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author stone tiger
 * @date 2019/11/6
 */
public class Locks {
    private static ReentrantLock lock = new ReentrantLock(true);
    private static ReentrantReadWriteLock lock1 = new ReentrantReadWriteLock(true);
    //  1   2     3      4   7
    public static void main(String[] args) throws InterruptedException {
        lock.lock();
        Condition condition = lock.newCondition();

        condition.await();
        condition.signal();
        //lock.unlock();
        Lock readLock = lock1.readLock();
        Lock writeLock = lock1.writeLock();
        //readLock.unlock();
        System.out.println(1111);
        writeLock.lock();
        readLock.lock();
        readLock.unlock();
        writeLock.lock();
        System.out.println(2111);
        writeLock.unlock();
    }

}
