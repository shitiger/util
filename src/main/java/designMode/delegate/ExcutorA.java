package designMode.delegate;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class ExcutorA implements IExcuter {
    @Override
    public void execute(String s1) {
        System.out.println(s1);
    }
}
