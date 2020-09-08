package enumTest;

import com.sun.scenario.effect.impl.prism.PrImage;

import static enumTest.NestEnum.TypeEnum.TYPE_ANIMAL1;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/8
 */
public enum NestEnum {

    DOG(1,"dog",TypeEnum.TYPE_ANIMAL1),
    CAT(2,"CAT",TypeEnum.TYPE_ANIMAL2),
    PIG(3,"pig",TypeEnum.TYPE_ANIMAL3);

    private int code;

    private String des;

    private TypeEnum typeEnum;

    NestEnum(int i, String dog,TypeEnum typeEnum) {
        this.code = i;
        this.des = dog;
        this.typeEnum = typeEnum;
    }

    enum TypeEnum{
        TYPE_ANIMAL1(1,"TYPE_ANIMAL1"),
        TYPE_ANIMAL2(1,"TYPE_ANIMAL2"),
        TYPE_ANIMAL3(1,"TYPE_ANIMAL3");

        private int code;

        private String des;

        TypeEnum(int i, String type_animal1) {
            this.code = i;
            this.des = type_animal1;
        }
    }
}
