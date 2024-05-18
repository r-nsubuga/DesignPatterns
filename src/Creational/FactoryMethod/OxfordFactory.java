package Creational.FactoryMethod;

public class OxfordFactory implements ShoeFactory{
    @Override
    public Shoe makeShoe() {
        Shoe oxford = new Oxford();
        return oxford;
    }
}
