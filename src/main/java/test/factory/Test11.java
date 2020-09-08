package test.factory;

/**
 * @author stone tiger
 * @Description:
 * @date 2020/1/19
 */
public class Test11 {
    private static Test11 test;

    static {
        test = new Test11();
    }

  //  private static final String name = new String("string_name");
    private static final String name = "string_name";

    private String testName;

    private Test11() {
        testName = name;
    }

    public static void main(String[] args) {
        System.out.println(test.testName);
    }

}
