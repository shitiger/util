package designMode.single;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(new Test().getClass().getClassLoader().getParent().getParent());
        System.out.println(new Test().getClass().getClassLoader().getParent());
        System.out.println(new Test().getClass().getClassLoader());
    }
}
