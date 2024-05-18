package Behavior.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    /*
     This is your publisher
     it notifies its listeners in case of any change to it
     */
    List<Observer> observerList = new ArrayList<Observer>();
    void addObservers(Observer observer){
        observerList.add(observer);
    }
    void removeObservers(Observer observer){
        observerList.remove(observer);
    }

    void notifyObservers(){
        for(Observer observer:observerList){
            observer.update("NEW_STATE");

        }
    }
}
