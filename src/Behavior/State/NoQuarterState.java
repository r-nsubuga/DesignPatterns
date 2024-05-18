package Behavior.State;

public class NoQuarterState implements State{
    GumballMachine machine;
    public NoQuarterState(GumballMachine machine){
        this.machine  = machine;
    }
    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
