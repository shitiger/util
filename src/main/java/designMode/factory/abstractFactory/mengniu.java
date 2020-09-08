package designMode.factory.abstractFactory;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class mengniu implements Milk {
    @Override
    public String say() {
        System.out.println("伊利");
        return "伊利";
    }
}
