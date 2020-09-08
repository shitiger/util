package designMode.stratege;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class RunContext {

    private Runtarget runtarget;

    RunContext(Runtarget runtarget){
        this.runtarget = runtarget;
    }

    void run(Integer id){
        String s1 =runtarget.run(id);
        System.out.println(s1);

    }

}
