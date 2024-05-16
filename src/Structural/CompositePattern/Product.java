package Structural.CompositePattern;

public class Product implements Component{
    private double price;

    public Product(double price){
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
