package designMode.factory.abstractFactory;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class Telunsu implements Milk {
    @Override
    public String say() {
        System.out.println("特论苏");
        return "特论苏";
    }
}
