package Behavior.ObserverPattern;

public class Client {
    public static void main(String[] args){
        Channel channel = new Channel();
        Listener listener  = new Listener();
        channel.addObservers(listener);
        channel.notifyObservers();

        Writer writer = new Writer();
        channel.addObservers(writer);
        channel.notifyObservers();
    }

}
