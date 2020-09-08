package designMode.factory.singleFactory;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class Test {

    public static void main(String[] args) {
        SinpleFactory sinpleFactory = new SinpleFactory();
        System.out.println(sinpleFactory.getMilkCategory("yili").getName());
    }
}
