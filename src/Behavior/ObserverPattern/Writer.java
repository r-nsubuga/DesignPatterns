package Behavior.ObserverPattern;

public class Writer implements Observer{
    @Override
    public void update(Channel channel) {
        System.out.println("New state for Writer is "+ channel.getPrice());
    }
}
