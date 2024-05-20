package Behavior.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    /*
     This is your publisher
     it notifies its listeners in case of any change to it
     */
    private double price = 0.0;

    public double getPrice(){
        return this.price;
    }
    List<Observer> observerList = new ArrayList<Observer>();
    void addObservers(Observer observer){
        observerList.add(observer);
    }
    void removeObservers(Observer observer){
        observerList.remove(observer);
    }

    void notifyObservers(){
        for(Observer observer:observerList){
            observer.update(this);

        }
    }
    void changePrice(double newPrice){
        this.price = newPrice;
    }
}
