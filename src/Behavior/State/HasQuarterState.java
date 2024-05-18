package Behavior.State;

public class HasQuarterState implements State{
    GumballMachine machine;
    public HasQuarterState(GumballMachine machine){
        this.machine  = machine;
    }
    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        machine.setState(machine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        System.out.println("Turned");
        machine.setState(machine.soldState);
    }

    @Override
    public void dispense() {

    }
}