package designMode.factory.singleFactory;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/9/18
 */
public class SinpleFactory {

    Milk getMilkCategory(String name){

        Milk milk = null;
        switch (name){
            case "yili":
                milk = new Yili();
                break;
            case "mengniu":
                milk = new Mengniu();
                break;
        }
        return milk;
    }
}
