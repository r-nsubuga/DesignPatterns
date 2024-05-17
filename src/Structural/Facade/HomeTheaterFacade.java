package Structural.Facade;

public class HomeTheaterFacade {
    Television tv;
    Woofer woofer;
    DvdPlayer player;

    public HomeTheaterFacade(Television tv, Woofer woofer, DvdPlayer player){
        this.tv = tv;
        this.woofer = woofer;
        this.player = player;
    }

    void watchMovie(){
        tv.on();
        tv.volumeUp();
        woofer.on();
        tv.volumeDown();
        player.startMovie();
    }
    void endMovie(){
        player.endMovie();
        woofer.off();
        tv.off();
    }
}
