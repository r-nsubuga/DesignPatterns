package Behavior.IteratorPattern;

public class ArrayIterator implements Iterator{
    IterableCollection collection;
    private int index = 0;

    public ArrayIterator(IterableCollection collection){
        this.collection = collection;
    }
    @Override
    public boolean hasNext() {
        return index >= 0 && index < collection.size() ;
    }

    @Override
    public Object next() {
        Object item = collection.get(index);
        index = index +1 ;
        return item;
    }
}
