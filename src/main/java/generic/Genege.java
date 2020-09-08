package generic;

import org.apache.poi.ss.formula.functions.T;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/23
 */
public class Genege<K> {

    private T t;

    public T say(T t){
        System.out.println(t.getClass());
        return t;
    }
}
