package designMode.build;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/28
 */
public interface CarBuilder {


    public CarBuilder setLungu(String s1);

    public CarBuilder setChedeng(String s1);

    public Car build();
}
