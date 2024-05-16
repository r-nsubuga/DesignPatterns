package Behavior.TemplateMethodPattern;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk");
    }
}
