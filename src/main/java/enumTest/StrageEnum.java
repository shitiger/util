package enumTest;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/8
 */
public enum StrageEnum {


    PERSON_ONE(1,"人1") {
        @Override
        String getDes() {
            return "heihei";
        }
    },
    PERSON_TWO(1,"人1") {
        @Override
        String getDes() {
            return "heihei222";
        }
    },
    PERSON_THREE(1,"人1") {
        @Override
        String getDes() {
            return "heihei2223343";
        }
    };

    private int code;

    private String des;

    StrageEnum(int code,String des){
        this.code = code;
        this.des = des;
    }

    abstract String getDes();

    public static void main(String[] args) {
        System.out.println(StrageEnum.PERSON_ONE.getDes());
    }
}
