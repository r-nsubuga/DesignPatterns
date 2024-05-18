package Creational.Builder;

public class StrawHouseBuilder implements Builder{
    private StrawHouse strawHouse;

    @Override
    public void buildRoof() {
        System.out.println("make the roof grass thatched");
    }

    @Override
    public void buildFoundation() {
        System.out.println("use reeds and straw");
    }

    @Override
    public void buildWalls() {
        System.out.println("use straw only ");
    }

    @Override
    public Object getProduct() {
        return this.strawHouse;
    }
}
