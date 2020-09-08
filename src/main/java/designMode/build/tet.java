package designMode.build;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/28
 */
public class tet {
    public static void main(String[] args) {
        Car car = new CarBuilderImpl().setChedeng("chongqing").setChedeng("dada").build();
        System.out.println(car);
    }
}
