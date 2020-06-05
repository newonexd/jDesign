package structure.decorator;

public class Main {
    public static void main(String[] args){
        Computer computer= new ThinkPadComputer();
        computer = new Disk(computer);
        computer = new Screen(computer);

        System.out.println(computer.getInformation()+"共计"+computer.price());

        computer = new Disk(computer);
        System.out.println(computer.getInformation()+"共计"+computer.price());

    }
}