package create_singleton;

/**
 * 枚举单例
 */
public enum SingleEnum {

    INSTANCE;

    public int getId() {
        return -1;
    }

    public static SingleEnum getInstance() {
        return INSTANCE;
    }
}
