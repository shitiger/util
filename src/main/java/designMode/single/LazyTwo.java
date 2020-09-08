package designMode.single;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class LazyTwo {

    private static Instant instan = null;

    public Instant getInstan(){
        if (instan == null){
            synchronized (LazyTwo.class){
                if (instan == null){
                    instan = new Instant();
                }
            }
        }
        return instan;
    }
}
