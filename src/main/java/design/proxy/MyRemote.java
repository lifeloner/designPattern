package design.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by fuyang on 2017/1/27.
 */
public interface MyRemote extends Remote {
    public String say() throws RemoteException;
}
