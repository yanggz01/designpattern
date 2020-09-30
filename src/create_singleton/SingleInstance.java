package create_singleton;

/**
 * 静态内部类单例
 */
public class SingleInstance {

    private SingleInstance(){}

    public static SingleInstance getInstance() {
        return SingleInstanceHolder.singleInstance;
    }

    private static class SingleInstanceHolder {
        private static final SingleInstance singleInstance = new SingleInstance();
    }
}
