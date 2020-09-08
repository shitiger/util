package designMode.single;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class LazyThree {

    public static Instant getInstant(){
        return SingleHolder.instant;
    }

    public static class SingleHolder{
        private static final Instant instant = new Instant();
    }
}
