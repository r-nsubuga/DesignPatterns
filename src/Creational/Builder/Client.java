package Creational.Builder;

public class Client {
    public static void main(String[] args){
        Builder stoneHouseBuilder = new StoneHouseBuilder();

        Director director = new Director(stoneHouseBuilder);
        director.make();

        Object house = stoneHouseBuilder.getProduct();
    }
}
