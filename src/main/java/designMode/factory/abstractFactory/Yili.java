package designMode.factory.abstractFactory;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class Yili implements Milk{
    @Override
    public String say() {
        System.out.println("伊利牛奶");
        return "伊利牛奶";
    }
}
