package designMode.factory.abstractFactory;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public abstract class AbstractFactory {


    public void eat(){
        System.out.println("牛奶很好喝的哦");
    }

    abstract String getTelunsu();

    abstract String yili();

    abstract String mengniu();

}
