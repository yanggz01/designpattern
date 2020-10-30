package behavior_iterator;

public interface Iterator<E> {
    boolean hasNext();
    void next();
    E currentItem();
}