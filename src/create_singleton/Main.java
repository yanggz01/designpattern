package create_singleton;

public class Main {
    public static void main(String[] args) {
        int id = SingleEnum.INSTANCE.getId();
        SingleEnumExample singleEnumExample = SingleEnumExample.getInstance();
    }
}
