package behavior.handler;

public class Main {
    public static AbstractLogger getLogChain(){
        AbstractLogger info = new InfoLogger();
        AbstractLogger debug = new DebugLogger();
        AbstractLogger error = new ErrorLogger();
    
        info.setLogger(debug);
        debug.setLogger(error);
        return info;
    }
    public static void main(String[] args){
        AbstractLogger chain = getLogChain();
        chain.log(AbstractLogger.INFO, "INFO");
        chain.log(AbstractLogger.DEBUG,"DEBUG");
    }
}