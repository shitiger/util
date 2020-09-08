package designMode.stratege;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class RunB implements Runtarget {
    @Override
    public String run(Integer id) {
        System.out.println("上海");
        return "runB";
    }
}
