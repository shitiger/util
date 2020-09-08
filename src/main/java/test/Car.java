package test;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/7/29
 */
public class Car{

    private int a = 12;

    private static int b = 22;

    private static final int s = 33;

    private static final String s2 = "shihu";

    private ThreadLocal threadLocal = new ThreadLocal();

    Car(){
        threadLocal.set("");
        threadLocal.get();
        threadLocal.remove();
        System.out.println(s2);
    }

    public void test1(){
        synchronized (this){
            try {
                System.out.println(111);
            } catch (Exception e) {
            }
        }
        System.out.println("11111111"+this);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1==(car1=car2));
    }

    public void test2(){
        System.out.println("11111111");
    }

    public void asd(){
        System.out.println(this);
    }
}
