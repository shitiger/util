package designMode.factory.singleFactory;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class Mengniu implements Milk {

    @Override
    public String getName() {
        System.out.println("mengniu");
        return "mengniu";
    }
}
