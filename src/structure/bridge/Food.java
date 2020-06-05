package structure.bridge;

public abstract class Food{
    protected EatMethod eatMethod;

    protected Food(EatMethod eatMethod){
        this.eatMethod = eatMethod;
    }
    public abstract void eated();
}

class Apple extends Food{
    private String food = "苹果";

    protected Apple(EatMethod eatMethod) {
        super(eatMethod);
    }

    @Override
    public void eated() {
        eatMethod.eat(this.food);
    }
}
class Orange extends Food{
    private String food = "橘子";

    protected Orange(EatMethod eatMethod) {
        super(eatMethod);
    }

    @Override
    public void eated() {
        eatMethod.eat(this.food);
    }

}