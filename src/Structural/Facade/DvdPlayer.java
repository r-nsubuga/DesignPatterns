package Structural.Facade;

public class DvdPlayer {
    String movie ;
    public DvdPlayer(String movie){
        this.movie = movie;
    }
    void startMovie(){
        System.out.println("Play "+ movie);
    }
    void endMovie(){
        System.out.println("Stop movie");
    }
}
