package create_singleton;

/**
 * 枚举单例模式（懒汉模式）
 */
public class SingleEnumExample {

    private SingleEnumExample() {

    }

    private enum SingleEnum{

        INSTANCE;

        private SingleEnumExample singleEnumExample;

        SingleEnum() {
            singleEnumExample = new SingleEnumExample();
        }

        public SingleEnumExample getInstance() {
            return singleEnumExample;
        }
    }

    public static SingleEnumExample getInstance() {
        return SingleEnum.INSTANCE.getInstance();
    }

}
