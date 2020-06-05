package structure.proxy;

public class Main {
    public static void main(String[] args){
        ComputerService computerService = new ComputerProxy();
        computerService.makeComputer();
    }
}