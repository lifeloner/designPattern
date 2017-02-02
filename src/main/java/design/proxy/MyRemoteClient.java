package design.proxy;

import java.rmi.Naming;

/**
 * Created by fuyang on 2017/1/27.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1:1099/MyRemote");
            System.out.println(myRemote.say());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
