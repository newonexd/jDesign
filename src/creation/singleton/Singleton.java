package creation.singleton;

/**
 * 懒汉模式
 */
public class Singleton {
    private Singleton(){}

    private static Singleton INSTANCE = new Singleton();
    public Singleton getINSTANCE(){
        return INSTANCE;
    }
}