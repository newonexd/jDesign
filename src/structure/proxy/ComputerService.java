package structure.proxy;

public interface ComputerService{
    Computer makeComputer();
}
class ComputerServiceImpl implements ComputerService{

    @Override
    public Computer makeComputer() {
        Computer computer = new Computer();
        computer.setCpu("macCpu");
        computer.setScreen("macScreen");
        return computer;
    }
    
}