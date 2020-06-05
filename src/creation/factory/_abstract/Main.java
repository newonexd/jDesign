package src.creation.factory._abstract;

public class Main {
    public static void main(String[] args){
        Factory factory = new MacFactory();
        

        Cpu cpu = factory.makeCpu();
        Screen screen = factory.makeScreen();

        Computer computer = factory.makeComputer(cpu, screen);

        System.out.println(computer.toString());


        factory = new ThinkPadFactory();
        cpu = factory.makeCpu();
        screen = factory.makeScreen();

        computer = factory.makeComputer(cpu, screen);

        System.out.println(computer.toString());
    }
}