package Structural.Facade;

public class FacadeTest {
    public static void main(String[] args){
        //create components
        Television tv = new Television();
        Woofer woofer = new Woofer();
        DvdPlayer player = new DvdPlayer("Transformers:Age of Extinction");

        //instantiate the facade with the components
        HomeTheaterFacade facade = new HomeTheaterFacade(tv, woofer, player);
        facade.watchMovie();

        //end movie
        facade.endMovie();

    }
}
