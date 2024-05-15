package Behavior.State.GumBallGame;

public class SoldState implements State{
    GumballMachine machine;
    public SoldState(GumballMachine machine){
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
