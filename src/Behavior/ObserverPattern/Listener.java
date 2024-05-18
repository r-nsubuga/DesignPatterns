package Behavior.ObserverPattern;

public class Listener implements Observer{
    @Override
    public void update(String state) {
        System.out.println("New state for listener is "+ state);
    }
}
