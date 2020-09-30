package create_singleton;

/**
 * 饿汉模式
 */
public class SingleEager {

    private static final SingleEager single = new SingleEager();

    public static SingleEager getInstance() {
        return single;
    }
}
