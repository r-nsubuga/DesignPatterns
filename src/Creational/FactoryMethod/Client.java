package Creational.FactoryMethod;

public class Client {
    public static void main(String[] args){
        ShoeFactory shoeFactory = new OxfordFactory();
        Shoe oxford = shoeFactory.makeShoe();
        oxford.getShoe();

        ShoeFactory shoeFactory1 = new ConverseFactory();
        Shoe converse = shoeFactory1.makeShoe();
        converse.getShoe();
    }
}
