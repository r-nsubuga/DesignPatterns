package Behavior.ObserverPattern;

public class Writer implements Observer{
    @Override
    public void update(String state) {
        System.out.println("New state for Writer is "+ state);
    }
}
