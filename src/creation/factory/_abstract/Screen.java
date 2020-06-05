package creation.factory._abstract;

public abstract class Screen {
    public String screen;

    @Override
    public String toString(){
        return this.screen;
    }
}

class MacScreen extends Screen{
    public MacScreen(){
        super();
        super.screen="mac";
    }
}
class ThinkPadScreen extends Screen{
    public ThinkPadScreen(){
        super();
        super.screen = "ThinkPad";
    }
}