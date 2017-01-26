package design.singleton;

/**
 * Created by fuyang on 2017/1/17.
 */
public class SingletonTwo {

    private static volatile SingletonTwo singletonTwo;
    private SingletonTwo(){}
    public static SingletonTwo getInstance(){
        if(singletonTwo==null){
            synchronized (SingletonTwo.class){
                if(singletonTwo==null){
                    singletonTwo=new SingletonTwo();
                }
            }
        }
        return singletonTwo;
    }
}
