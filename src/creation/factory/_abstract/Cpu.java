package creation.factory._abstract;

public abstract class Cpu {
    String cpu;

    @Override
    public String toString(){
        return this.cpu;
    }
}

class MacCpu extends Cpu{
    public MacCpu(){
        super();
        super.cpu = "mac";
    }
}

class ThinkPadCpu extends Cpu{
    public ThinkPadCpu(){
        super();
        super.cpu = "ThinkPad";
    }
}