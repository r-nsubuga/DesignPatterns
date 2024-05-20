package Behavior.ObserverPattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new price: ");
        double price = scanner.nextDouble();

        Channel channel = new Channel();

        channel.changePrice(price);

        Observer listener  = new Listener();
        channel.addObservers(listener);
        channel.notifyObservers();

        Observer writer = new Writer();
        channel.addObservers(writer);
        channel.notifyObservers();
    }

}
