package designMode.stratege;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class Test  {

    public static void main(String[] args) {
        RunA runA = new RunA();
        RunContext runContext = new RunContext(runA);
        runContext.run(2);
    }
}
