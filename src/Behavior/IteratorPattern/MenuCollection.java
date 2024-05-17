package Behavior.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class MenuCollection implements IterableCollection{

    List<String> menu= new ArrayList<String>();
    @Override
    public Iterator createIterator() {
        return new ArrayListIterator(this);
    }
     void add(String item){
        menu.add(item);
     }

    public int size(){
        return menu.size();
    }

    @Override
    public String get(int index) {
        return menu.get(index);
    }

}
