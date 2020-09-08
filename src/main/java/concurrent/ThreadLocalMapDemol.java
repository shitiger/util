package concurrent;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/15
 */
public class ThreadLocalMapDemol {

    public static void main(String[] args) {
        ThreadLocal<Object> s1 =new ThreadLocal<>();
        ThreadLocal<Object> s2 =new ThreadLocal<>();
        s1.set("s1");
        s1.get();
        s2.set("s2");
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        s1.remove();
        s2.remove();
        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}
