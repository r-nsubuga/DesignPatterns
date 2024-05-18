package Creational.FactoryMethod;

public class ConverseFactory implements ShoeFactory{
    @Override
    public Shoe makeShoe() {
        Shoe converse = new Converse();
        return converse;
    }
}
