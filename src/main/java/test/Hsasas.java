package test;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/6/24
 */
public class Hsasas {
    public static void main(String[] args) {
       /* RedCart redCart = new RedCart();
        redCart.test1();
        redCart.test2();*/
       Long s1 =  System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 1000000000; i++) {
            s.append(i);
        }
        System.out.println(System.currentTimeMillis()-s1);
    }
}
