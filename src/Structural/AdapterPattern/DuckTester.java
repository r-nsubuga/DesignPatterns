package Structural.AdapterPattern;

public class DuckTester {
    public static void main(String[] args){
        //for a normal duck
        Duck duck = new ConcreteDuck();
        duck.fly();
        duck.quack();

        //for a turkey
        Turkey turkey = new Turkey();
        turkey.fly();
        turkey.gobble();

        //after adapting the turkey as a duck
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
