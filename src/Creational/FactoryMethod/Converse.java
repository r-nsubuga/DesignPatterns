package Creational.FactoryMethod;

public class Converse extends Shoe{
    public Converse(){
        label = "All Stars";
        sole = "rubber";
        material = "cloth";
    }

    @Override
    void getShoe() {
        System.out.println("You shoe is "+label+" with a "+sole+
                " and material is "+material);
    }
}
