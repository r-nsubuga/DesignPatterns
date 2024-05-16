package Structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component{
    private List<Component> children = new ArrayList<>();
    private double cost;
    public Box(double cost){
        this.cost = cost;
    }
    public void addComponent(Component component){
        children.add(component);
    }
    @Override
    public double getPrice() {
        double total  = cost;
        for (Component child: children){
            total+=child.getPrice();
        }
        return total;
    }
}
