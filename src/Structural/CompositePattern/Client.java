package Structural.CompositePattern;

public class Client {
    public static void main(String[] args){
        Product product1 = new Product(2.0);

        Box box = new Box(5.0);
        box.addComponent(product1);
        double price = box.getPrice();
        System.out.println("Total Price is " + price);

        Box box2 = new Box(4.0);
        box2.addComponent(new Product(1.0));
        box.addComponent(box2);

        price = box.getPrice();
        System.out.println("New Price is "+ price);


    }
}
