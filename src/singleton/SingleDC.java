package singleton;

/**
 * 双重检查单例
 */
public class SingleDC {

    private static SingleDC singleDC;

    private SingleDC(){}

    public static SingleDC getInstance() {
        if(singleDC != null) {
            synchronized (SingleDC.class) {
                if(singleDC != null) {
                    singleDC = new SingleDC();
                }
            }
        }
        return singleDC;
    }
}
