package structure_proxy.dynamicproxy;

import structure_proxy.interfaceproxy.IUserController;
import structure_proxy.interfaceproxy.UserController;

public class Main {
    public static void main(String[] args) {
        //MetricsCollectorProxy使用举例
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
    }
}
