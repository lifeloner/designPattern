package design.singleton;

/**
 * Created by fuyang on 2017/1/17.
 */
public class SingletonIner {
    private static SingletonIner singletonIner;
    private SingletonIner(){}

    public static SingletonIner getSingleton(){
        return Iner.INSTANCE;
    }
    private static class Iner{
        private  final static SingletonIner INSTANCE=new SingletonIner();
    }
}
