package Creational.Builder;

public class Director {
    Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void make(){
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
    }

}
