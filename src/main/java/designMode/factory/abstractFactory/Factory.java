package designMode.factory.abstractFactory;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class Factory extends AbstractFactory {
    @Override
    String getTelunsu() {
        super.eat();
        return new Telunsu().say();
    }

    @Override
    String yili() {
        return new mengniu().say();
    }

    @Override
    String mengniu() {
        return new Yili().say();
    }
}
