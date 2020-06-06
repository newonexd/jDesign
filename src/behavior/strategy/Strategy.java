package behavior.strategy;

public interface Strategy{
    public void work();
}

class Walk implements Strategy{

    @Override
    public void work() {
        System.out.println("步行去工作");
    }

}

class Bicycle implements Strategy{

    @Override
    public void work() {
        System.out.println("骑车去工作");
    }

}

class Driver implements Strategy{

    @Override
    public void work() {
        System.out.println("开车去工作");
    }

}