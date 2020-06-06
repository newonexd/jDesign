package behavior.strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void excuteWork(){
        this.strategy.work();
    }
}