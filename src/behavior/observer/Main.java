package behavior.observer;

public class Main {
    public static void main(String[] args){
        Subject subject = new Subject();

        new Observer1("A",subject);
        new Observer1("B",subject);

        subject.setMessage("新消息");
    }
}