package src.creation.factory.factory;

public class Main {
    public static void main(String[] args){
        CarFactory carFactory = new ChineseCarFactory();
        Car car = carFactory.makeCar("Byd");
        System.out.println(car.toString());

        carFactory  = new OtherCarFactory();
        car = carFactory.makeCar("BMW");
        System.out.println(car.toString());
    }
}