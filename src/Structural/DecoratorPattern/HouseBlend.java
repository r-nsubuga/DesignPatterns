package Structural.DecoratorPattern;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "HouseBlend Coffee";
    }
    @Override
    double cost() {
        return .89;
    }
}
