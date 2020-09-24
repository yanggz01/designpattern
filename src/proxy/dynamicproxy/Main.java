package proxy.dynamicproxy;

import proxy.interfaceproxy.IUserController;
import proxy.interfaceproxy.UserController;

public class Main {
    public static void main(String[] args) {
        //MetricsCollectorProxy使用举例
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
    }
}
