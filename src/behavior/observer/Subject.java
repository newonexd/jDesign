package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private String message;

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
        this.notifyAllObservers();
    }
    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void deAttach(Observer observer){
        if(this.observers.contains(observer))
            this.observers.remove(observer);
    }
    public void notifyAllObservers(){
        this.observers.forEach(o->o.update());
    }
}