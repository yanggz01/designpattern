package singleton;

/**
 * 饿汉模式
 */
public class SingleEger {

    private static final SingleEger single = new SingleEger();

    public static SingleEger getInstance() {
        return single;
    }
}
