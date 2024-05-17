package Behavior.IteratorPattern;

public interface IterableCollection {
    Iterator createIterator();
    int size();
    Object get(int index);

}
