package designMode.delegate;

import java.util.HashMap;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class DeleDateExcutor {

    private static HashMap<String,IExcuter> hashMap = new HashMap<>();

    static {
        hashMap.put("A",new ExcutorA());
        hashMap.put("B",new ExcutorB());
    }


    public void excute(String s1){
        hashMap.get(s1).execute(s1);
    }
}
