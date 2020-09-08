package proxy.JDKProxy;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/6/19
 */
public class Accord implements Car {
    @Override
    public void run(String dreiver) {
        System.out.println("running");
    }

    @Override
    public String eat(String food) {
        return null;
    }
}
