package test;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/24
 */
public class ThreadA implements Runnable {

    private static int a = 100;

    @Override
    public void run() {
        while (a < 0){
            a--;
            System.out.println(a);
        }
    }
}
