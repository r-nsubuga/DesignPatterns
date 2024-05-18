package Behavior.StrategyPattern;

public class Client {
    public static void main(String[] args){
        Strategy strategy = new ConcreteStrategy1();

        Context context = new Context();
        context.setStrategy(strategy);
        context.doSomething();
    }
}
