package structure.bridge;

public class Main {
    public static void main(String[] args){
        EatMethod eatMethod = new Direct();
        Food food = new Apple(eatMethod);
        food.eated();

        EatMethod eatMethod2 = new Indirect();
        Food food2 = new Apple(eatMethod2);
        food2.eated();

    }
}