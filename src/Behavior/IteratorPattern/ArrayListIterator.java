package Behavior.IteratorPattern;

import java.util.NoSuchElementException;

public class ArrayListIterator implements Iterator{
    IterableCollection collection;
    private int index = 0;

    public ArrayListIterator(IterableCollection collection){
        this.collection = collection;
    }
    public boolean hasNext() {
        return index < collection.size();
    }

    public Object next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return collection.get(index++);
    }
}
