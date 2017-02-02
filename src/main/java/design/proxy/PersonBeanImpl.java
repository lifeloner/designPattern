package design.proxy;

/**
 * Created by fuyang on 2017/1/27.
 */
public class PersonBeanImpl implements PersonBean {
    private String name;

    public PersonBeanImpl(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
}
