package behavior_iterator;

public class ArrayList<E> implements List<E> {
    //...
    public Iterator iterator() {
        return new ArrayIterator(this);
    }

    @Override
    public E get(int cursor) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    //...省略其他代码
}