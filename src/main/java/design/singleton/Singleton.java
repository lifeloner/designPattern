package design.singleton;

/**
 * Created by fuyang on 2017/1/17.
 */
public class Singleton {
    private static  Singleton singleton;
    private Singleton(){}

    public static synchronized Singleton getInstance_one(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }

}
