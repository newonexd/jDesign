package structure.proxy;

public class ComputerProxy implements ComputerService{
    private ComputerService computerService = new ComputerServiceImpl();

    @Override
    public Computer makeComputer() {
        System.out.println("proxy:  组装电脑......");
        Computer computer = computerService.makeComputer();
        System.out.println(computer.toString());
        System.out.println("proxy:  组装完成");
        return computer;
    }
}