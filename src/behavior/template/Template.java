package behavior.template;

public abstract class Template {
    public void templateMethod() {
        init();
        apply();
        destoy();
    }
    protected void init(){
        System.out.println("init()已实现，可覆写");
    }
    public abstract void apply();

    protected void destoy(){
        System.out.println("destoy()已实现，可覆写");
    }
}

class Concrete extends Template{

    @Override
    public void apply() {
        System.out.println("子类具体实现");
    }

} 