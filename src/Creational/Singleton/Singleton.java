package Creational.Singleton;

public class Singleton {
    // EagerSingleton Creation
//    private static Singleton uniqueInstance = new Singleton();

    //double-checked locking declaration
//    private volatile static  uniqueInstance;

    // LazySingletonCreation
    private static Singleton uniqueInstance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //double-checked locking
//    public static Singleton getInstance(){
//        if(uniqueInstance==null){
//            synchronized (Singleton.class){
//                if(uniqueInstance==null){
//                    uniqueInstance = new Singleton();
//                }
//            }
//        }
//        return uniqueInstance;
//    }
}
