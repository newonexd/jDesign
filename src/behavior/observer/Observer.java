package behavior.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

class Observer1 extends Observer{
    private String name;
    public Observer1(String name,Subject subject){
        this.name = name;
        this.subject = subject;
        this.subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println(this.name+"收到消息:" +this.subject.getMessage());
    }

}