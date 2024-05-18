package Creational.Builder;

public interface Builder {
    void buildRoof();
    void buildFoundation();
    void buildWalls();
    Object getProduct();

}
