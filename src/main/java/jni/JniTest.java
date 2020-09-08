package jni;

/**
 * @author stone tiger
 * @Description:
 * @date 2020/5/14
 */
public class JniTest {

    private native void nativeMethod(int i);

    public static void main(String args[]) {

        JniTest c = new JniTest();

//call the jni native method

        c.nativeMethod(1000000);

    }

    static {

//load the jni library

        System.loadLibrary("StaticMethodCall");

    }
}
