package Behavior.IteratorPattern;

public class ArrayMenuCollection implements IterableCollection{
    Integer[] menuArray = new Integer[3] ;
    int index = 0;
    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this);
    }
    public void add (int value){
        menuArray[index]  = value ;
        index ++;
    }

    @Override
    public int size() {
        return menuArray.length;
    }

    @Override
    public Integer get(int index) {
        index = index++ ;
        return menuArray[index];
    }
}
