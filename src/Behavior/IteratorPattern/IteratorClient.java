package Behavior.IteratorPattern;

public class IteratorClient {
    public static void main(String[] args){
        MenuCollection menu = new MenuCollection();
        menu.add("cow");
        menu.add("goat");

        Iterator iterator = menu.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayMenuCollection menuArray = new ArrayMenuCollection();
        menuArray.add(1);
        menuArray.add(5);
        menuArray.add(6);

        Iterator iterator2 = menuArray.createIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
