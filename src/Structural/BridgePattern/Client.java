package Structural.BridgePattern;

public class Client {
    public static void main(String[] args){
        Color blue = new Blue();
        Shape shape = new Shape(blue);
        shape.addColor();
    }
}
