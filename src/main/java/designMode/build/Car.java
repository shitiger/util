package designMode.build;

import afu.org.checkerframework.checker.oigj.qual.O;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/28
 */
public class Car {

    private String lungu;

    private String chedeng;

    private Object object;

    Car(String s1, String s2,Object o){
        this.lungu=s1;
        this.chedeng=s2;
        this.object=o;
    }

    public String getLungu() {
        return lungu;
    }

    public void setLungu(String lungu) {
        this.lungu = lungu;
    }

    public String getChedeng() {
        return chedeng;
    }

    public void setChedeng(String chedeng) {
        this.chedeng = chedeng;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
