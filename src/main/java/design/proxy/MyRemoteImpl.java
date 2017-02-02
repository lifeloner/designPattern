package design.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by fuyang on 2017/1/27.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException{}

    @Override
    public String say() throws RemoteException {
        return "hello,rmi !";
    }

    public static void main(String[] args) {
        try {
            MyRemote service=new MyRemoteImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://127.0.0.1:1099/MyRemote",service);
        }catch (Exception ex){
           ex.printStackTrace();
        }
    }
}
