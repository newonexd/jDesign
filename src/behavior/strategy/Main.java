package behavior.strategy;

public class Main {
    public static void main(String[] args){
        Context context = new Context(new Driver());
        context.excuteWork();
    }
}