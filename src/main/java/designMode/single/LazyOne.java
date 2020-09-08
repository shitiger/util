package designMode.single;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class LazyOne {

    private static Instant instant = null;

    public static synchronized Instant getInstant(){
        if (instant !=null){
            instant = new Instant();
        }
        return instant;
    }
}
