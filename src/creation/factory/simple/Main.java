package creation.factory.simple;

public class Main {
    public static void main(String[] args) {
        System.out.println(Factory.makeCar("audi"));
        System.out.println(Factory.makeCar("BMW"));
    }
}