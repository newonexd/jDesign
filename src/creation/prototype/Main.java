package creation.prototype;

public class Main {
    public static void main(String[] args){
        Prototype prototype = new Prototype();
        prototype.setName("prototype1");
        Prototype prototype2 = (Prototype)prototype.clone();
        System.out.println(prototype2.getName());
    }
}