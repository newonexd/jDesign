package structure.facade;

public interface Computer {
    void makeComputer();
}

class MacComputer implements Computer{

    @Override
    public void makeComputer() {
        System.out.println("制作Mac");
    }
}
class ThinkPadComputer implements Computer{

    @Override
    public void makeComputer() {
        System.out.println("制作ThinkPad");
    }
}
class XiaoMiComputer implements Computer{

    @Override
    public void makeComputer() {
        System.out.println("制作XiaoMi");
    }
}