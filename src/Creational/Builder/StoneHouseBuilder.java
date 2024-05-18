package Creational.Builder;

public class StoneHouseBuilder implements Builder{
    StoneHouse stoneHouse;

    public void reset() {
        this.stoneHouse = new StoneHouse();
    }

    @Override
    public void buildRoof() {
        System.out.println("put iron sheets");
    }

    @Override
    public void buildFoundation() {
        System.out.println("dig up a strong foundation");
    }

    @Override
    public void buildWalls() {
        System.out.println("use stones and cement");
    }

    public Object getProduct(){
        this.reset();
        return this.stoneHouse;
    }
}
