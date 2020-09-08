package designMode.build;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/28
 */
public class CarBuilderImpl implements CarBuilder {

    private String lungu;

    private String chedeng;
    @Override
    public CarBuilder setLungu(String s1) {
        this.lungu = s1;
        return this;
    }

    @Override
    public CarBuilder setChedeng(String s1) {
        this.chedeng = s1;
        return this;
    }

    @Override
    public Car build() {
        return new Car(lungu,chedeng,new Object());
    }
}
