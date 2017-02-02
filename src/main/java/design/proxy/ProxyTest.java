package design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by fuyang on 2017/1/27.
 */
public class ProxyTest {
    public static void main(String[] args) {
        PersonBean personBean=new PersonBeanImpl("fuyang");
        OwnerInvocationHandler ownerInvocationHandler=new OwnerInvocationHandler(personBean);
        NonOwnerInvocationHandler noownerInvocationHandler=new NonOwnerInvocationHandler(personBean);
        System.out.println(Proxy.isProxyClass(personBean.getClass()));
        personBean=ownerInvocationHandler.getOwnerProxy();
        System.out.println(personBean.getName());
        personBean.setName("2017 happy!");
        System.out.println(Proxy.isProxyClass(personBean.getClass()));
        personBean=noownerInvocationHandler.getOwnerProxy();
        System.out.println(personBean.getName());
        personBean.setName("fuyang");
    }
}
