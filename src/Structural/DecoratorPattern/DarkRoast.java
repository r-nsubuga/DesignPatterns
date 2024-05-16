package Structural.DecoratorPattern;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "DarkRoast";
    }
    @Override
    double cost() {
        return 2.99;
    }
}
