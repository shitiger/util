package proxy.JDKProxy;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/6/19
 */
public class Dog implements Animal {
    @Override
    public String eat(String food) {
        System.out.println("dog want to eat");
        return food;
    }
}
