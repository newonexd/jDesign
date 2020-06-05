package src.creation.singleton;

/**
 * 饱汉模式
 */
public class Singleton2 {
    private Singleton2(){}
    private static volatile Singleton2 INSTANCE = null;

    public Singleton2 getINSTANCE(){
        if(INSTANCE==null){
            synchronized(Singleton2.class){
                if(INSTANCE==null){
                    INSTANCE=new Singleton2();
                }
            }
        }
        return INSTANCE;
    }
}