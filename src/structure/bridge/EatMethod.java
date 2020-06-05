package structure.bridge;

public interface EatMethod {
    public void eat(String food);
}

class Direct implements EatMethod{

    @Override
    public void eat(String food) {
        System.out.println("直接拿着"+food+"吃。");
    }
}

class Indirect implements EatMethod{

    @Override
    public void eat(String food) {
        System.out.println("先把"+food+"切成块再吃。");
    }

}