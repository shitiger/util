package concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/8
 */
public class MapDemo {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable();
        hashtable.put("1","1");
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("1","1");
        HashMap<String,String> hashMap = new HashMap();
        concurrentHashMap.put("1","1");
        concurrentHashMap.get("1");
        concurrentHashMap.putIfAbsent("12","");

        System.out.println(130);
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set(12);
        threadLocal.get();
        ConcurrentSkipListMap concurrentSkipListMap = new ConcurrentSkipListMap();
        concurrentSkipListMap.put("12","1212");
        System.out.println(concurrentSkipListMap.get("12"));
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(Collections.singleton(12));
       // concurrentLinkedQueue.add();
       // concurrentLinkedQueue.offer();
      //  concurrentLinkedQueue.peek();
      //  concurrentLinkedQueue.poll();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.get(1);
    }
}
