package designMode.factory.singleFactory;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class Yili implements Milk {
    @Override
    public String getName() {
        System.out.println("yili");
        return "yili";
    }
}
