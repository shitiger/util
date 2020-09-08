package designMode.stratege;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class RunA implements Runtarget {
    @Override
    public String run(Integer id) {
        System.out.println("北京");
        return "runA";
    }
}
