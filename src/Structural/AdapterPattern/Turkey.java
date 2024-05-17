package Structural.AdapterPattern;

public class Turkey {
    void gobble(){
        System.out.println("Gobble");
    }
    void fly(){
        for(int i = 0; i<=5;i++){
            System.out.println("Flying");
        }
    }
}
