package concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/7
 */
public class MyReenrranLock implements Lock{

    class MyCondition implements Condition{

        @Override
        public void await() throws InterruptedException {
            syn.wait();
        }

        @Override
        public void awaitUninterruptibly() {

        }

        @Override
        public long awaitNanos(long nanosTimeout) throws InterruptedException {
            return 0;
        }

        @Override
        public boolean await(long time, TimeUnit unit) throws InterruptedException {
            return false;
        }

        @Override
        public boolean awaitUntil(Date deadline) throws InterruptedException {
            return false;
        }

        @Override
        public void signal() {

        }

        @Override
        public void signalAll() {

        }
    }

    private Syn syn;

    public static class Syn extends AbstractQueuedSynchronizer {

        @Override
        protected boolean tryAcquire(int arg) {
            int state = getState();
            if (state ==0){
                if (compareAndSetState(state,1)){
                    setExclusiveOwnerThread(Thread.currentThread());
                    return true;
                }
            }
            if (Thread.currentThread()==getExclusiveOwnerThread()){
                for(;;){
                    if (compareAndSetState(state,state+1))
                        break;
                }
                return true;
            }

            return false;
        }

        @Override
        protected boolean tryRelease(int arg) {
            int state = getState();
            if (state == 0){
                throw new RuntimeException("111");
            }

            if (Thread.currentThread()==getExclusiveOwnerThread()){
                for(;;){
                    if (compareAndSetState(state,state-1))
                        break;
                }
            }

            return false;
        }
    }

    MyReenrranLock(){
        syn = new Syn();
    }

    @Override
    public void lock() {
        syn.acquire(1);
        syn.release(1);
        syn.acquireShared(1);
        syn.releaseShared(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        syn.tryAcquire(1);
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        syn.release(1);
    }

    @Override
    public Condition newCondition() {
        return null;
    }


}
