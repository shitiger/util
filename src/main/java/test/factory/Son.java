package test.factory;

import java.security.PublicKey;

/**
 * @author stone tiger
 * @Description:
 * @date 2020/1/19
 */
public class Son extends Parent {
    static{
        i=0; //给变量赋值可以正常编译通过
       // System.out.println(i);//这句编译器会提示"非法向前引用"
    }
    static int i=1;
    public static int s1 = 1;

    Son(){
        System.out.println("Son");
    }
}
