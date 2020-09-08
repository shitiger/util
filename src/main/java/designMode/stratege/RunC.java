package designMode.stratege;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class RunC implements Runtarget {
    @Override
    public String run(Integer id) {
        System.out.println("重庆");
        return "runB";
    }
}
