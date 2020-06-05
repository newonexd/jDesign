package structure.adapter;

public interface Cat {
    public void miao();
    public void eat();
}

class WildCat implements Cat{

    @Override
    public void miao() {
        System.out.println("喵喵叫");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }

}