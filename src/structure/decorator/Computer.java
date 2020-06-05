package structure.decorator;

public abstract class Computer {
    public abstract String getInformation();
    public abstract int price();
}

class ThinkPadComputer extends Computer{
    @Override
    public String getInformation() {
        
        return "ThinkPad";
    }
    @Override
    public int price() {
        return 10000;
    }
}