package creation.singleton;

/**
 * 嵌套模式 线程安全
 */
public class Singleton3 {
    private Singleton3(){}
    private static class Handler{
        private static Singleton3 INSTANCE = new Singleton3();
    }
    public Singleton3 getINSTANCE(){
        return Handler.INSTANCE;
    }
}