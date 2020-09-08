package concurrent;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/11
 */
public class BlockQueen implements Delayed{

    static ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(2);

    static LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();

    static PriorityQueue priorityQueue = new PriorityQueue(2);

    static DelayQueue delayQueue = new DelayQueue();

    public static void main(String[] args) throws InterruptedException {

        arrayBlockingQueue.add(111111111);
        arrayBlockingQueue.put(1);
        arrayBlockingQueue.put(22222);
        arrayBlockingQueue.offer(12);
        arrayBlockingQueue.take();
        linkedBlockingDeque.take();
        linkedBlockingDeque.peek();
       // linkedBlockingDeque.put();

        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.add("");
      /*  arrayBlockingQueue.take()
        linkedBlockingDeque.put();
        linkedBlockingDeque.take();*/
      //  linkedBlockingDeque.add();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
