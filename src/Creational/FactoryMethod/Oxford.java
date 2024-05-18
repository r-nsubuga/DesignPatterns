package Creational.FactoryMethod;

public class Oxford extends Shoe{
    public Oxford(){
        label = "Clarks";
        sole = "rubber";
        material = "leather";
    }

    @Override
    void getShoe() {
        System.out.println("You shoe is "+label+" with a "+sole+
                " and material is "+material);
    }
}
