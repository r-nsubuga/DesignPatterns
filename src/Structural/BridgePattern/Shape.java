package Structural.BridgePattern;

public class Shape {
    Color color;
    public Shape(Color color){
        this.color = color;
    }

    public void addColor(){
        color.addColor();
    }
}
