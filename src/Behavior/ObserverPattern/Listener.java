package Behavior.ObserverPattern;

public class Listener implements Observer{
    @Override
    public void update(Channel channel) {
        System.out.println("New state for listener is "+ channel.getPrice());
    }
}
