package behavior_iterator;


public interface List<E> {
    Iterator iterator();

    E get(int cursor);

    int size();

    //...省略其他接口函数...
}