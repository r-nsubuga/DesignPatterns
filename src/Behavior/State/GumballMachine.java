package Behavior.State;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if(numberGumballs>0){
            state = noQuarterState ;
        } else {
            state = soldOutState;
        }
    }

    //delegation of actions to the current class
    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    void setState(State state){ //transition to another state
        this.state = state;
    }
    //helper method to release ball and decrement count
    void releaseBall(){
        System.out.println("GumBall out");
        if(count!=0){
            count = count-1;
        }
    }
}
