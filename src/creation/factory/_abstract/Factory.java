package creation.factory._abstract;
public interface Factory{
    Cpu makeCpu();
    Screen makeScreen();
    Computer makeComputer(Cpu cpu,Screen screen);
}

class MacFactory implements Factory{

    @Override
    public Cpu makeCpu() {
        Cpu cpu = new MacCpu();
        return cpu;
    }

    @Override
    public Screen makeScreen() {
        Screen screen = new MacScreen();
        return screen;
    }

    @Override
    public Computer makeComputer(Cpu cpu,Screen screen) {
        return new Computer(cpu, screen);
    }

}

class ThinkPadFactory implements Factory{

    @Override
    public Cpu makeCpu() {
        Cpu  cpu = new ThinkPadCpu();
        return cpu;
    }

    @Override
    public Screen makeScreen() {
        Screen screen = new ThinkPadScreen();
        return screen;
    }

    @Override
    public Computer makeComputer(Cpu cpu, Screen screen) {
        return new Computer(cpu, screen);
    }

}