package Behavior.StrategyPattern;

public class Context {
    Strategy strategy;
    void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    void doSomething(){
        strategy.executeStrategy();
    }
}
