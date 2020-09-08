package designMode.single;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class HungrySIngle {

    private static final Instant instanve = new Instant();

    public Instant getInstanve(){
        return instanve;
    }
}
